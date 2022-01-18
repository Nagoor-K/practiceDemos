
import java.util.*;
public class foreachDemo {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
	  ArrayList<String> alist=new ArrayList<>();
	  alist.add("Football");  
      alist.add("Cricket");  
      alist.add("Chess");  
      alist.add("Hocky");
      alist.add("Kabbadi");
      
      // iterating the array list elements using the for each loop
      
      alist.forEach(i -> System.out.println(i));
  }
}
