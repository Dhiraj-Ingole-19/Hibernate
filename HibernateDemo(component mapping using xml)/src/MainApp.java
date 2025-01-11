

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;

public class MainApp {

	public static void main(String[] args) {
		 Configuration c= new Configuration();
		 SessionFactory sf=c.configure().buildSessionFactory();
		 Session s=sf.openSession();
		  Transaction t=s.beginTransaction();
		  
		  
		  Employee e1= new Employee(101,"Dhiraj",20000,new Address(1,"seed","karveroad","pune"));
		  Employee e2= new Employee(102,"Anuj",20000,new Address(2,"seed","Akurdi","pune"));
		  
		  s.save(e1);
		  s.save(e2);
		  t.commit();
		  sf.close();
	}

}
