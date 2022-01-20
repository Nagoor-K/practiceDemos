import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.BootstrapServiceRegistryBuilder;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class Main {

  public static void main(String[] args) {
	  
	  alien_name an=new alien_name();
	  an.setFname("Patan");
	  an.setLname("Nagoor");
	  an.setMname("Khan");
	  Alien na=new Alien();
	  na.setId(101);
	  na.setName(an);
	  na.setSection("CSE - 01");
	  
	  
	  Configuration con=new Configuration().configure().addAnnotatedClass(Alien.class);
	  
	  SessionFactory sf=con.buildSessionFactory();
	  
	  Session session=sf.openSession();
	  
	  Transaction tx =session.beginTransaction();
	  
	  session.save(na);
	  
	  tx.commit();
	  
  }
}
