import javax.persistence.EntityManager;

import org.hibernate.Query;
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
	  
	  Query q1=session.createQuery("from House where hid=89");
	  house=(House) q1.uniqueResult();
	  System.out.println(house);
	  tx.commit();
	  
	  session.close();
  }
}
