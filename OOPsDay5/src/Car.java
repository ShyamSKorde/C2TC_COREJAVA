public class Car {
     //Member Variable 
     // Member Function/methods
	int noofcars;
	String Model;
	public String getModel()
	{
		return Model; 
	}
	public void setModel(String M) 
	{
		this.Model=M;  
	}
	void display1()
	{
		System.out.println("wclome to audi");
	}
	void display3()
	{
		System.out.println("wclome to BMW");
	}
	public static void main(String[] args)
	{
		//object creation 
		Car obj = new Car();
		obj.setModel("sghbhjhmn");
		System.out.println(obj.getModel());
		obj.display1();
		obj.display3();
		// TODO Auto-generated method stub

	}

}
