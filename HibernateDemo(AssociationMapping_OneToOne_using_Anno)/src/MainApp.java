import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {

    public static void main(String[] args) {
        Configuration configuration = new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        Session session = null;
        Transaction transaction = null;

        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();

            // Create Employee and EmployeeDetail objects
            Employee emp = new Employee("Dhiraj", "Ingole", "19/09/2000", "9834411080");
            EmployeeDetail eDetail = new EmployeeDetail("Sinhgad Road", "Pune", "Maharashtra", "India");

            // Set relationship
            emp.setEmployeeDetail(eDetail);

            // Save Employee (cascade saves EmployeeDetail)
            session.save(emp);

            transaction.commit();
            System.out.println("Data saved successfully!");

        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
            sessionFactory.close();
        }
    }
}
