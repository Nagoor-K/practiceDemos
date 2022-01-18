import java.util.*;

interface adding{
	void add(int x,int y);
}

interface multiplying{
	void mul(int x,int y);
}

class arthemeticoperations{
	public static void sum(int a,int b) {
		System.out.println("sum of two numbers is "+(a+b));
	}
	public void product(int a, int b) {
		System.out.println("product is : "+ (a*b));
	}
	
}

public class methodReferenceDemo {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
	  Scanner scan=new Scanner(System.in);
	  //using method reference we are creating a reference add method to the sum method
	  //hence this is a static method so no need to create object
	  
	  adding a=arthemeticoperations::sum;
	  a.add(scan.nextInt(), scan.nextInt());
	  
	  // here we need to create object because we can not refer directly to a non static method product
	  multiplying m=new arthemeticoperations()::product;//here we created anonymous object
	  m.mul(scan.nextInt(),scan.nextInt());
  }
}
