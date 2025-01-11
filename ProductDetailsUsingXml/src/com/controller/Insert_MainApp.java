
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Product;

public class Insert_MainApp  {

	public static void main(String[] args) {

			Session s=Utility.getSessionfactory().openSession();
			Transaction t=s.beginTransaction();
			
			 Product p1 = new Product(101, "Chocolate", 100, "Cadbury", "10/10/2024");
		        Product p2 = new Product(102, "Watch", 1000, "Noise", "10/10/2024");
		        Product p3 = new Product(103, "Mouse", 500, "realme", "10/10/2024");
		        Product p4 = new Product(104, "Phone", 30000, "realme","10/10/2024");
		        Product p5 = new Product(105, "Laptop", 100000, "Victus", "10/10/2024");
			  
			s.save(p1);
			s.save(p2);
			s.save(p3);
			s.save(p4);
			s.save(p5);
			
			t.commit();
			s.close();
			

	
		
	      
	 
	}

}
