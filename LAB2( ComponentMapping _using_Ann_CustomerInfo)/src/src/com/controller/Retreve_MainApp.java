package src.com.controller;

import java.util.Scanner;
import org.hibernate.Query; // Use this for older Hibernate versions
import org.hibernate.Session;
import org.hibernate.Transaction;
import src.com.model.Customer;

public class Retreve_MainApp {

    public static void main(String[] args) {

        // Open session
        Session s = Utility.getSessionfactory().openSession();
        Transaction t = s.beginTransaction();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Customer ID: ");
        int cid = sc.nextInt();

        try {
            // HQL to retrieve Customer
            String hql = "from Customer where id = :cid";
            Query q = s.createQuery(hql); // No second parameter in older versions
            q.setParameter("cid", cid);

            Object o = q.uniqueResult(); // Casting manually
            if (o != null) {
                Customer customer = (Customer) o;
                System.out.println("Customer Details:");
                System.out.println(customer);
            } else {
                System.out.println("Customer with ID " + cid + " not found.");
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
