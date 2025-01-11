import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.Query; // For older Hibernate versions

public class MainApp {

    public static void main(String[] args) {
        SessionFactory sf = null;
        Scanner sc = new Scanner(System.in);

        try {
            // Initialize Hibernate
            sf = new Configuration().configure().buildSessionFactory();
            Session session = sf.openSession();
            Transaction transaction = session.beginTransaction();

            // Creating Student Objects
            Address addr1 = new Address("MG Road", "Pune", "India", "411001");
            Address addr2 = new Address("FC Road", "Pune", "India", "411002");

            Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse("10/12/2024");
            Date date2 = new SimpleDateFormat("dd/MM/yyyy").parse("15/01/2025");

            PrimaryStudent ps1 = new PrimaryStudent(101, "Dhiraj", date1, addr1, "A");
            SecondaryStudent ss1 = new SecondaryStudent(102, "Rushikesh", date2, addr2, 85.5f);

            session.save(ps1);
            session.save(ss1);

            transaction.commit();
            System.out.println("Students created successfully!");

            // Retrieving Student by Roll Number
            System.out.print("Enter RollNo to retrieve: ");
            int rollNo = sc.nextInt();

            session.beginTransaction();
            String hql = "from Student where rollNo = :rollNo";
            Query query = session.createQuery(hql);
            query.setParameter("rollNo", rollNo);

            Student student = (Student) query.uniqueResult();
            if (student != null) {
                System.out.println("Student Details:");
                System.out.println(student);
            } else {
                System.out.println("No student found with RollNo: " + rollNo);
            }

            session.getTransaction().commit();
            session.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (sf != null) {
                sf.close();
            }
            sc.close();
        }
    }
}
