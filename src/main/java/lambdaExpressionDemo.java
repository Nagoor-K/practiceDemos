import java.util.*;

interface laptop{
	void show(String str);
}
//this whole class purpose is just to implement the above show method so here we use lambda expression to focus mainly on functional interface
//class hp implements laptop{
//	public void show(String str) {
//		System.out.println("the given hp laptop model is : "+str);
//	}
//}

public class lambdaExpressionDemo {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
	  Scanner scan=new Scanner(System.in);
	  //here we are implemented the show method from the interface laptop
	  laptop l=(str) -> {
		  System.out.println("The given laptop is "+str);
	  };
	  l.show(scan.next());
  }
}
