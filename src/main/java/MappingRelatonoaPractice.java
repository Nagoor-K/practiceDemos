import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MappingRelatonoaPractice {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
	  
	  Student student=new Student();
	  student.setSid(161074);
	  student.setSname("Patan Nagoor Khan");
	  student.setMark(90);
	  
	  
	  Laptop laptop=new Laptop();
	  laptop.setLid(101);
	  laptop.setLname("HP");
	  
	  student.getLaptops().add(laptop);
	  
	  Configuration con=new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
	  SessionFactory sf=con.buildSessionFactory();
	  Session session=sf.openSession();
	  Transaction tx=session.beginTransaction();
	  
	  session.save(student);
	  session.save(laptop);
	  
	  tx.commit();
	  
  }
}
