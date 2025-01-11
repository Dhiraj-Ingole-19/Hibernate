package com.query;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Employee;

public class HQL_select_query6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration c= new Configuration();
		SessionFactory sf=c.configure().buildSessionFactory();
		Session s=sf.openSession();

		
		String hql ="from Employee where ename=:name";
		Query q = s.createQuery(hql);
		q.setParameter("name", "sumit");
		Object o =q.uniqueResult();
		Employee e = (Employee)o;
		System.out.println("Employee ID:"+e.getEid());
		System.out.println("Employee Name :"+e.getEname());
		System.out.println("Salary :"+e.getEsal());
		s.close();
		sf.close();

	}

}
