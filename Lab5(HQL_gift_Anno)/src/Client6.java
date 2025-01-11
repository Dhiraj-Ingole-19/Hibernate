import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Client6 {

    public static void main(String[] args) {
        // Step 1: Create a Hibernate Configuration and build SessionFactory
        Configuration c = new Configuration();
        c.configure("hibernate.cfg.xml"); // Ensure this file is correctly configured
        SessionFactory sf = c.buildSessionFactory();

        // Step 2: Open a Hibernate session
        Session s = sf.openSession();
        
        try {
            // Step 3: Create HQL query to fetch min price, max price, and total count of gifts
            String hql = "select min(g.price), max(g.price), count(g) from Gift g";
            Query q = s.createQuery(hql);

            // Step 4: Execute the query and fetch results
            Object[] result = (Object[]) q.uniqueResult(); // Single result as Object[]

            // Extract the values from the result
            Float minPrice = (Float) result[0];   // Minimum price
            Float maxPrice = (Float) result[1];   // Maximum price
            Long totalCount = (Long) result[2];   // Total count of gifts

            // Step 5: Display the results
            System.out.println("Gift details summary:");
            System.out.println("Minimum Price: " + minPrice);
            System.out.println("Maximum Price: " + maxPrice);
            System.out.println("Total Number of Gifts: " + totalCount);
        } finally {
            // Step 6: Close the session and session factory
            s.close();
            sf.close();
        }
    }
}
