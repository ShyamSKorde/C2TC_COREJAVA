public class Car1 {
	
	int noofcars;
	String Model;
	
	void display1()
	{
		System.out.println("Welcome to Kia-Motors ");
	}

	void display2()
	{
		System.out.println("Welcome to Benz ");
	}
	
	void display3()
	{
		System.out.println("Welcome to BMW ");
	}
	public static void main(String[] args) {
		
		Car1 obj = new Car1();
		obj.display1();
		obj.display2();
		obj.display3();
		
	}

}
