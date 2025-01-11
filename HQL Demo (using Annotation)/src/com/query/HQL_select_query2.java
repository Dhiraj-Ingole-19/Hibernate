package com.query;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HQL_select_query2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration c= new Configuration();
		SessionFactory sf=c.configure().buildSessionFactory();
		Session s=sf.openSession();
		
		String hql="select ename from Employee";
		Query q=s.createQuery(hql);
		@SuppressWarnings("unchecked")
		List <String> lst =q.list();
		
		System.out.println("Employee name are :");
		for(String str:lst)
		{
			System.out.println(str);
		}
		

	}

}
