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
	Employee e1= new Employee(101,"Sumit",10550);
	Employee e2= new Employee(102,"Dhiraj",12550);
	Employee e3= new Employee(103,"Patu",15550);
	
	
	//Persistence 
	s.save(e1);
	s.save(e2);
	s.save(e3);
	
	t.commit();
	s.close();
	sf.close();
  }
}