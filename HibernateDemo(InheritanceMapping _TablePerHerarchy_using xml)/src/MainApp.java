
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
		  
		  
		  Employee e1= new Employee(101,"Dhiraj",20000);
		  Employee e2= new PerEmployee(102,"Anuj",25000,"Manager","IT");
		  Employee e3= new TempEmployee(103,"ayush",20050,50,"Infosis");
		  
		  s.save(e1);
		  s.save(e2);
		  s.save(e3);
		  t.commit();
		  sf.close();
	}

}
