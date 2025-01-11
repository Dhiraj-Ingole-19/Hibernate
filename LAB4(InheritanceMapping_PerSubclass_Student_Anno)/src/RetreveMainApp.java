

import java.util.Scanner;
import org.hibernate.Query; // Use this for older Hibernate versions
import org.hibernate.Session;
import org.hibernate.Transaction;

public class RetreveMainApp {

    public static void main(String[] args) {

        // Open session
        Session s = Utility.getSessionfactory().openSession();
        Transaction t = s.beginTransaction();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter RollNo: ");
        int rollNo = sc.nextInt();

        try {
            // HQL to retrieve Customer
            String hql = "from Student where rollNo = :rollNo";
            Query q = s.createQuery(hql); // No second parameter in older versions
            q.setParameter("rollNo", rollNo);

            Object o = q.uniqueResult(); // Casting manually
            if (o != null) {
               Student student = (Student) o;
                System.out.println("Student Details:");
                System.out.println(student);
            } else {
                System.out.println("Student" + rollNo + " not found.");
            }

            // Commit transaction
            t.commit();
        } catch (Exception e) {
            if (t != null) {
                t.rollback();
            }
            e.printStackTrace();
        } finally {
            // Close resources
            s.close();
            sc.close();
        }
    }
}
