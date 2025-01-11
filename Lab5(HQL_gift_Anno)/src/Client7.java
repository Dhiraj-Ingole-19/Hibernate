import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;
import java.util.Scanner;

public class Client7 {

    public static void main(String[] args) {
        // Step 1: Create Hibernate Configuration and build SessionFactory
        Configuration c = new Configuration();
        c.configure("hibernate.cfg.xml"); // Ensure this file is correctly configured
        SessionFactory sf = c.buildSessionFactory();

        try (Scanner sc = new Scanner(System.in)) {
            // Step 2: Open a Hibernate session
            Session s = sf.openSession();
            
            // Get input from the user for minimum and maximum price range
            System.out.print("Enter minimum amount: ");
            float minAmount = sc.nextFloat();
            
            System.out.print("Enter maximum amount: ");
            float maxAmount = sc.nextFloat();

            try {
                // Step 3: Create HQL query to fetch data from the Gift entity using positional parameters
                String hql = "from Gift where price between ? and ?";
                Query q = s.createQuery(hql);
                
                // Set parameters correctly
                q.setParameter(0, minAmount);   // Set positional parameter ?1 (min price)//use o based index in hibernate
                
                q.setParameter(1, maxAmount);   // Set positional parameter ?2 (max price)

                // Step 4: Execute the query and fetch results
                @SuppressWarnings("unchecked")
                List<Gift> lst = q.list();

                // Step 5: Display the results
                System.out.println("Gift details are:");
                if (lst.isEmpty()) {
                    System.out.println("No gifts found in the specified price range.");
                } else {
                    // Print each gift and its price
                    for (Gift gift : lst) {
                        System.out.println("Gift Name: " + gift.getGiftName() + ", Price: " + gift.getPrice());
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                // Step 6: Close the session
                s.close();
            }
        } finally {
            // Step 7: Close the session factory
            sf.close();
        }
    }
}
