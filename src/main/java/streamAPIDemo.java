import java.util.*;
import java.util.stream.*;

public class streamAPIDemo {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
	  //for each method in stream api
	  List<Integer> arr = Arrays.asList(1,2,3,4,5,6,7,8,9);
	  arr.stream().forEach(y->System.out.print(y+" "));
	  System.out.println();
	  // map method
	  arr.stream().map(x->x*x).forEach(y->System.out.print(y+ " "));
	  System.out.println();
	  
	  //filter method used to filter out the elements from the list
	  List<String> names = Arrays.asList("Nagoor","Patan","Durga","Prasad","Vinod","Khan");
	  names.stream().filter(s->s.startsWith("P")).forEach(i -> System.out.print(i+" "));;
	  System.out.println();
	  

	  //collect method is used to collect the filtered elements
	  List<String> result = names.stream().filter(s->s.startsWith("P")).collect(Collectors.toList());
	  System.out.println(result);
  }
}
