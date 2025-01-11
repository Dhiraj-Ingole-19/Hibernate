package com.query;

import org.hibernate.cfg.*;
import org.hibernate.*;

public class HQL_Delete_query {

	public static void main(String[] args) {
		



		Configuration c=new Configuration();

		 SessionFactory sf=c.configure().buildSessionFactory();

		 Session se=sf.openSession();

		  Transaction t=se.beginTransaction();

		 String hql="delete from Employee where eid=9";

		 Query q=se.createQuery(hql);

		 int i=q.executeUpdate();


	System.out.println(i+" No of records deleted.!!");


		t.commit();


		se.close();

		sf.close();

	}

}
