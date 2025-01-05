package com.controller;
import com.model.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class MainApp 
{
  public static void main(String[] args) 
  {
	Configuration c= new Configuration();
	SessionFactory sf=c.configure().buildSessionFactory();
	Session s=sf.openSession();
	Transaction t=s.beginTransaction();
	
	//Transient 
	Employee e2= new Employee(102,"Sumit",12550);
	
	//Persistence 
	s.save(e2);
	
	t.commit();
	s.close();
	sf.close();
  }// end main
}//end class
