package src.com.controller;

import org.hibernate.Session;
import org.hibernate.Transaction;

import src.com.model.Address;
import src.com.model.Customer;

public class Insert_MainApp {

    public static void main(String[] args) {

        // Open session and begin transaction
        Session session = null;
        Transaction transaction = null;

        try {
            session = Utility.getSessionfactory().openSession();
            transaction = session.beginTransaction();
            
    
            Address a1 = new Address("MG Road", "Pune", "India", "411001");
            Address a2 = new Address("Brigade Road", "Bangalore", "India", "560001");
            Address a3 = new Address("Marine Drive", "Mumbai", "India", "400020");
            Address a4 = new Address("Park Street", "Kolkata", "India", "700016");
            Address a5 = new Address("Anna Salai", "Chennai", "India", "600002");

          
            // Create Customer objects
            Customer c1 = new Customer(1, "Dhiraj", "9834411080", "19/09/2000", a1);
            Customer c2 = new Customer(2, "Anuj", "9834411080", "19/09/2000", a2);
            Customer c3 = new Customer(3, "Dhirafsj", "9834411080", "19/09/2000",a3);
            Customer c4 = new Customer(4, "Dhirajdf", "9834411080", "19/09/2000", a4);
            Customer c5 = new Customer(5, "wheivraj", "9834411080", "19/09/2000", a5);

            // Save objects to the database
            session.save(c1);
            session.save(c2);
            session.save(c3);
            session.save(c4);
            session.save(c5);

            // Commit transaction
            transaction.commit();
            System.out.println("Customers inserted successfully!");

        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
}
