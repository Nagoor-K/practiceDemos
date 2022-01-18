
interface car{
	/*these static methods are same as the defult methods but the only difference is the statix methods can not be overridden by
	 * implementation class
	 */
	static void start() {
		System.out.println("the car is starting in the static method");
	}
	
	void show();
}

class audi implements car{
	public void show() {
		System.out.println("This is audi car");
	}
}


public class demostatic {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
	  
	  // example of static methods
	  car c=new audi();
	  car.start();
	  c.show();
	  
  }
}
