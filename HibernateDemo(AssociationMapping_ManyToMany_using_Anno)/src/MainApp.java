import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.HashSet;
import java.util.Set;

public class MainApp {

    public static void main(String[] args) {
        Configuration configuration = new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = null;
        Transaction transaction = null;
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();

            // Create Movie objects
            Movie m1 = new Movie(101, "DDLJ", new HashSet<>());
            Movie m2 = new Movie(102, "Kal Ho Na Ho", new HashSet<>());
            Movie m3 = new Movie(103, "Karan Arjun", new HashSet<>());

            // Save movies first
            session.save(m1);
            session.save(m2);
            session.save(m3);

            // Create Actor objects
            Actor a1 = new Actor(1, "SRK", new HashSet<>());
            Actor a2 = new Actor(2, "Salman", new HashSet<>());

            // Save actors first
            session.save(a1);
            session.save(a2);

            // Set relationships after saving actors and movies
            a1.getMovies().add(m1);
            a1.getMovies().add(m2);
            a1.getMovies().add(m3);

            a2.getMovies().add(m3);

            m1.getActors().add(a1);
            m2.getActors().add(a1);
            m3.getActors().add(a1);
            m3.getActors().add(a2);

            // Update relationships
            session.update(a1);
            session.update(a2);
            session.update(m1);
            session.update(m2);
            session.update(m3);

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

