import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPADemo {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
	  
	  CreditCard card=new CreditCard();
	  card.setCid(124);
	  card.setBrach("HDFC");
	  card.setCardno("09865432");
	  
	  EntityManagerFactory emf=Persistence.createEntityManagerFactory("persistenceUnitName");
	  
	  EntityManager em=emf.createEntityManager();
	  
	  em.getTransaction().begin();
	  
	  em.persist(card);
	  
	  em.getTransaction().commit();
	  
  }
}
