import java.util.*;


interface phone{
	//implementing method using the default keyword
	default void show() {
		System.out.println("Hello this is default method in the interface");
	}
	
	void add(int x,int y);
}

class androidphone implements phone{
	public void add(int x,int y) {
		System.out.println("Addition of x and y is : "+ (x+y));
	}
}

public class Main {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
	  Scanner scan=new Scanner(System.in);
	  
	  //1 defult methods in interface
	  phone p=new androidphone();
	  p.show();
	  p.add(scan.nextInt(), scan.nextInt());
	  
  }
}
