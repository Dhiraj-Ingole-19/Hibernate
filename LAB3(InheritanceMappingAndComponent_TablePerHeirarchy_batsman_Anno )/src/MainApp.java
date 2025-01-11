
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
		  
		  Address a1 = new Address("MG Road", "Pune", "India", "411001");
		  Address a2 = new Address("FC Road", "Pune", "India", "411002");
		  Address a3 = new Address("JM Road", "Pune", "India", "411003");
		  Address a4 = new Address("Karve Road", "Pune", "India", "411004");

		  
		  Batsman ba1=new Batsman(1,"dhiraj",50,a1,5000);
		  Batsman ba2=new Batsman(2,"rushi",40,a2,4000);
		  s.save(ba1);
		  s.save(ba2);
		  
		  
		  
		Bowler bo1=new Bowler(3,"ayaush",60,a3,600);
		Bowler bo2=new Bowler(4,"sheri",60,a4,500);
		  s.save(bo1);
		  s.save(bo2);
		  
		  
		  
		  t.commit();
		  sf.close();
	}

}
