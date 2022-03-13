public class DTBooleanChar
{
	boolean Boolean3;
	public static void main(String[] args) 
	{
		
		System.out.println("----Boolean----");
		boolean Boolean1 = true;
		boolean Boolean2 = false;
		System.out.println("Boolean Data Type value is := "+ Boolean1);
		System.out.println("Boolean Data Type value is := "+ Boolean2);
		DTBooleanChar BOOLEAN = new DTBooleanChar();
		System.out.println("Boolean Data Type default value is := "+ BOOLEAN.Boolean3);
		System.out.println("----Character----");
		char charMin = '\u0000';
		char charMax = '\uffff';
		System.out.println("char Minimum size is := "+charMin);
		System.out.println("char Maximum size is := "+charMax);
		System.out.println("Minimum size is \u0000' (or 0) to Maximum size is '\uffff' (or 65,535 inclusive");
	}
		


}
