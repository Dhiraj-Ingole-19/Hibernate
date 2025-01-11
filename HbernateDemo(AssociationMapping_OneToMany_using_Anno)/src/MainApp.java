import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class MainApp {

    public static void main(String[] args) {
      
        Configuration configuration = new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = null;
        Transaction transaction = null;

        try {
            // Open session and begin transaction
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();

            // Create departments
            Department dept1 = new Department();
            dept1.setDeptId(1);
            dept1.setDeptName("Sales");

            Department dept2 = new Department();
            dept2.setDeptId(2);
            dept2.setDeptName("Marketing");

            session.save(dept1);
            session.save(dept2);

            // Create employees and assign departments
            Employee e1 = new Employee(0, "Amir", "Khan", "5/3/23", "8569824173", null);
            Employee e2 = new Employee(0, "Salman", "Khan", "12/5/23", "8569824173", null);

            e1.setDepartment(dept1);
            e2.setDepartment(dept1);

            session.save(e1);
            session.save(e2);

            Employee e3 = new Employee(0, "Hgj", "Khan", "1/6/23", "8569824173", null);
            Employee e4 = new Employee(0, "Salscdvd", "Khan", "8/9/23", "8569824173", null);

            e3.setDepartment(dept2);
            e4.setDepartment(dept2);

            session.save(e3);
            session.save(e4);

            // Commit the transaction
            transaction.commit();
            System.out.println("Data saved successfully!");

        } catch (Exception e) {
            // Rollback in case of errors
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            // Cleanup resources
            if (session != null) {
                session.close();
            }
            sessionFactory.close();
        }
    }
}
