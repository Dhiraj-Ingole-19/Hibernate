

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
        System.out.print("Enter player ID: ");
        int pid = sc.nextInt();

        try {
            // HQL to retrieve Customer
            String hql = "from Player where id = :pid";
            Query q = s.createQuery(hql); // No second parameter in older versions
            q.setParameter("pid", pid);

            Object o = q.uniqueResult(); // Casting manually
            if (o != null) {
                Player player = (Player) o;
                System.out.println("player Details:");
                System.out.println(player);
            } else {
                System.out.println("player with ID " + pid + " not found.");
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
