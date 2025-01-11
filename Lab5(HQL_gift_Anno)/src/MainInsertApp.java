import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainInsertApp {

	public static void main(String[] args) {
	
				Configuration c= new Configuration();
				SessionFactory sf=c.configure().buildSessionFactory();
				Session s=sf.openSession();
				Transaction t=s.beginTransaction();
				
				  Gift gift1 = new Gift(1, "Photo Frame", "Accessories", 500);
			        Gift gift2 = new Gift(2, "Smartphone", "Electronics", 15000);
			        Gift gift3 = new Gift(3, "Teddy Bear", "Toys", 800);
			        Gift gift4 = new Gift(4, "Fitness Band", "Healthcare", 2500);
			        Gift gift5 = new Gift(5, "Watch", "Accessories", 2000);
			        Gift gift6 = new Gift(6, "Laptop", "Electronics", 55000);
			        Gift gift7 = new Gift(7, "Puzzle Game", "Toys", 700);
			        Gift gift8 = new Gift(8, "Yoga Mat", "Healthcare", 1200);
			        Gift gift9 = new Gift(9, "Sunglasses", "Accessories", 1500);
			        Gift gift10 = new Gift(10, "Headphones", "Electronics", 3000);

				//Persistence 
				s.save(gift1);
				s.save(gift2);
				s.save(gift3);
				s.save(gift4);
				s.save(gift5);
				s.save(gift6);
				s.save(gift7);
				s.save(gift8);
				s.save(gift9);
				s.save(gift10);

				
				t.commit();
				s.close();
				sf.close();


	}

}
