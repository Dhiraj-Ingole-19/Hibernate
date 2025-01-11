import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Client5 {

    public static void main(String[] args) {
        // Step 1: Create a Hibernate Configuration and build SessionFactory
        Configuration c = new Configuration();
        c.configure("hibernate.cfg.xml"); // Ensure this file is correctly configured
        SessionFactory sf = c.buildSessionFactory();

        // Step 2: Open a Hibernate session
        Session s = sf.openSession();
        
        try {
            // Step 3: Create HQL query to fetch only GiftName and Price
            String hql = "select g.giftName, g.price from Gift g"; // Fetch only GiftName and Price
            Query q = s.createQuery(hql);

            // Step 4: Execute the query and fetch results
            @SuppressWarnings("unchecked")
            List<Object[]> lst = q.list(); // Since partial selection is used, the result will be Object[]

            // Step 5: Display the results
            System.out.println("Gift details are:");
            for (Object[] row : lst) {
                String giftName = (String) row[0]; // First column: GiftName
                Float price = (Float) row[1];     // Second column: Price (Use Float)
                System.out.println("GiftName: " + giftName + ", Price: " + price);
            }
        } finally {
            // Step 6: Close the session and session factory
            s.close();
            sf.close();
        }
    }
}
