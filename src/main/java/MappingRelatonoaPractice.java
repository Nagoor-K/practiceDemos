import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MappingRelatonoaPractice {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
	  
	  Student student=new Student();
	  
	  Laptop laptop=new Laptop();
	  
	  Configuration con=new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
	  SessionFactory sf=con.buildSessionFactory();
	  Session session=sf.openSession();
	  Transaction tx=session.beginTransaction();
	  
	  student=session.get(Student.class, 161074);
	  
	  tx.commit();
	  
	  System.out.println(student);
  }
}
