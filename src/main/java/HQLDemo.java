import java.util.List;
import java.util.Random;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HQLDemo {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
	  
	  
	  Configuration con=new Configuration().configure().addAnnotatedClass(Teacher.class);
	  
	  SessionFactory sf=con.buildSessionFactory();
	  
	  Session session=sf.openSession();
	  
	  Transaction tx =session.beginTransaction();
	  
	  Teacher t=new Teacher();
	  t=session.get(Teacher.class, 101);
	  System.out.println(t);
	  
	  
	  Teacher t1=session.load(Teacher.class,102);
	  System.out.println(t1);
	  
	  
	  tx.commit();
	  
	  
	  session.close();
  }
}
