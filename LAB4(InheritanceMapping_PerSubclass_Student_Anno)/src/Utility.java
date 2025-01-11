

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Utility {

	public static SessionFactory getSessionfactory() {
		Configuration c= new Configuration();
		SessionFactory sf=c.configure().buildSessionFactory();
		return sf;
	}

}
