import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class hibDemo {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
	  
	  
	  Company cmp=new Company();
	  cmp.setCid(101);
	  cmp.setCname("Axelor");
	  
	  Employee emp=new Employee();
	  emp.setEid(161074);
	  emp.setEname("Patan Nagoor Khan");
	  emp.setContact("9014957265");
	  emp.getCompany().add(cmp);
	
	  
	  
	  Configuration con=new Configuration().configure().addAnnotatedClass(Employee.class).addAnnotatedClass(Company.class);
	  SessionFactory sf=con.buildSessionFactory();
	  Session session=sf.openSession();
	  Transaction tx=session.beginTransaction();
	  
	  session.save(emp);
	  session.save(cmp);
	  
	  tx.commit();
  }
}
