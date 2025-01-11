package com.query;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HQL_update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration c= new Configuration();
		SessionFactory sf=c.configure().buildSessionFactory();
		Session s=sf.openSession();
		@SuppressWarnings("unused")
		Transaction t=s.beginTransaction();
		String hql="update Employee set ename=\'vijay\'where eid=102";
		Query q=s.createQuery(hql);
		double avg=(Double)q.uniqueResult();
		System.out.println("Average salary is :"+avg);
		s.close();
		sf.close();
	}

}
