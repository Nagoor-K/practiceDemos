import java.time.*;

public class DateAPIDemo {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
	  //to use current date
	  LocalDate d= LocalDate.now();
	  System.out.println("Today date is "+d);
	  
	  //to find current time
	  LocalTime t = LocalTime.now();	                        
	  System.out.println("the current time is "+t);
	  
	  //to print in a particular format
	  Month month = d.getMonth();
	    int day = d.getDayOfMonth();
	    System.out.println("Month : "+month+" day : "+day);
	    
  }
}
