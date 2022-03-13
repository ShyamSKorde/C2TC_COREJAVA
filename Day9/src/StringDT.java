
public class StringDT
{
	public static void main(String[] args) 
	{
		String string = "Strings are used for storing text. A String variable contains a collection of characters surrounded by double quotes";
		System.out.println(" Print a Simple string is := "+string);//simple print text to string 
		String string1 = "Hello world";
	    String string2 = "GOOD EVINING";
	    String string3 = "All of you";
	    System.out.println(" Length of frist string1 is := "+string1.length());// length() is used to find the length of the string. i.e. 11
	    System.out.println("Length of second the string2 is := "+string2.length());// length() is used to find the length of the string.i.e 12
	    System.out.println("frist string1 is upper case : = "+string1.toUpperCase());   // convert lower to upper case //Outputs "HELLO WORLD"
	    System.out.println("second string2 is lower case := "+string2.toLowerCase());  //convert upper case to lower case // Outputs "hello world"
	    System.out.println("index of string is := "+string1.indexOf("world")); // indexOf(the position)return the position of the string // Outputs 5
	    System.out.println("connect two string is : = "+string2 +" "+string3);// The + operator can be used between strings to combine them. This is called concatenation
	    System.out.println("connect two string is := "+string2.concat(string3));// use the concat() method to concatenate two strings.
	}
	

}

