package com.query;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HQL_AggregrateFun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration c= new Configuration();
		SessionFactory sf=c.configure().buildSessionFactory();
		Session s=sf.openSession();
		
		String hql="select avg(esal) from Employee";
		Query q=s.createQuery(hql);
		double avg=(Double)q.uniqueResult();
		System.out.println("Average salary is :"+avg);
		s.close();
		sf.close();
	}

}
