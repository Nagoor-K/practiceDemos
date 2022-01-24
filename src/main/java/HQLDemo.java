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
	  t.setTid(106);
	  t.setTname("Vinod");
	  t.setSalary(90500);
	  session.save(t);
	  
	  t.setSalary(1500);
	  
	  
	  session.remove(t);
	  
	  tx.commit();
	  session.detach(t);//detach stage
	  
	  
	  t.setSalary(1200);
	  session.close();
  }
}
