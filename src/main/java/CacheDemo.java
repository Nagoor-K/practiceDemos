import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CacheDemo {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
	  House house;
	  
	  Configuration con=new Configuration().configure().addAnnotatedClass(House.class);
	  SessionFactory sf=con.buildSessionFactory();
	  Session session=sf.openSession();
	  Transaction tx=session.beginTransaction();
	  
	  house=session.get(House.class, 89);
	  tx.commit();
	  System.out.println(house);
	  session.close();
	  
	  Session session2=sf.openSession();
	  Transaction tx1=session2.beginTransaction();
	  
	  House house1=session2.get(House.class, 89);
	  tx1.commit();
	  System.out.println(house1);
  }
}
