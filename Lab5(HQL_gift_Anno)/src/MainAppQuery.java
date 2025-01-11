import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.util.List;

public class MainAppQuery {

    public static void main(String[] args) {
        // Step 1: Create a Hibernate Configuration and build SessionFactory
        Configuration c = new Configuration();
        c.configure("hibernate.cfg.xml"); // Ensure this file is correctly configured
        SessionFactory sf = c.buildSessionFactory();

        // Step 2: Open a Hibernate session
        Session s = sf.openSession();

        try {
            // Step 3: Create HQL query to fetch data from the Gift entity
            String hql = "from Gift";
            Query q = s.createQuery(hql);

            // Step 4: Execute the query and fetch results
            @SuppressWarnings("unchecked")
            List<Gift> lst = q.list();

            // Step 5: Display the results
            System.out.println("Gift details are:");
            for (Gift gift : lst) {
                System.out.println(gift);
            }
        } finally {
            // Step 6: Close the session and session factory
            s.close();
            sf.close();
        }
    }
}
