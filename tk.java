package cse;

public class tk {

	// static variable
	static int a = 10;
	static int b;
// static block
	static {
		System.out.println("Static block initialized.");
		b = a * 4;
	}
	public static void main(String[] args)
	{
	System.out.println("from main");
	System.out.println("Value of a : "+a);
	System.out.println("Value of b : "+b);
	}
}
class A2
{  
  static
	{
		System.out.println("static block is invoked");
	}  
  public static void main(String args[])
{  
   System.out.println("Hello main");  
  }  
}  


