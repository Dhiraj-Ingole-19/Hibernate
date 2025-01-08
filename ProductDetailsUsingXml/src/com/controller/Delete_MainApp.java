package com.controller;

import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Product;

public class Delete_MainApp {

    public static void main(String[] args) {

    	Session s=Utility.getSessionfactory().openSession();
        Transaction t = s.beginTransaction();

  
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product code: ");
        int pcode = sc.nextInt();


        try {
          
            String hql = "from Product where code = :pcode";
            Query q = s.createQuery(hql);
            q.setParameter("pcode", pcode);

            Object o = q.uniqueResult();

            if (o != null) {
                Product product = (Product) o;

  
                s.delete(product);

            } else {
                System.out.println("Product with code " + pcode + " not found.");
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
            sf.close();
            sc.close();
        }
    }
}
