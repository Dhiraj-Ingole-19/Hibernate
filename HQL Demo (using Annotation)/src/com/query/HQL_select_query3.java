package com.query;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HQL_select_query3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration c= new Configuration();
		SessionFactory sf=c.configure().buildSessionFactory();
		Session s=sf.openSession();
		
		String hql="select ename,esal from Employee";
		Query q=s.createQuery(hql);
		@SuppressWarnings("unchecked")
		List <String> lst =q.list();
		System.out.println("Employee name and salary are :");
		for(Object o:lst)
		{
			Object arr[]=(Object[])o;
			System.out.println(arr[0]+" ");
			System.out.println(arr[1]);
		}
		s.close();
		sf.close();
		
	}

}
