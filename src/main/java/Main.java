import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

  public static void main(String[] args) {
	  
	  
	  
	  Alien na=new Alien();
	  
	  na.setId(308);
	  na.setFname("Patan");
	  na.setLname("Nagoor Khan");
	  na.setSection("CSE - 01");
	  Configuration con=new Configuration().configure().addAnnotatedClass(Alien.class); 
	  SessionFactory sf=con.buildSessionFactory();
	  Session session=sf.openSession();
	  Transaction tx =session.beginTransaction();
	  session.save(na);
	  tx.commit();
	  
  }
}
