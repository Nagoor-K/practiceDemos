import java.util.Random;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HQLDemo {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
	  
	  Scanner scan=new Scanner(System.in);
	  
	  Configuration con=new Configuration().configure().addAnnotatedClass(Teacher.class);
	  
	  SessionFactory sf=con.buildSessionFactory();
	  
	  Session session=sf.openSession();
	  
	  Transaction tx =session.beginTransaction();
	  
	  Random r=new Random();
	  
	  
	  for(int i=1;i<=50;i++) {
		  Teacher t=new Teacher();
		  t.setTid(i);
		  t.setTname("Name : "+i);
		  t.setSalary(r.nextInt(100000));
		  session.save(t);
	  }
	  
	  tx.commit();
	  
	  session.close();
  }
}
