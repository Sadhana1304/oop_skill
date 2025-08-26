package cse;
import java.io.*;
public class StaticKeyword {
	
	
		private static String str = "java programming";
		// Static class
		static class MyNestedClass {
			// non-static method
			public void disp(){
			System.out.println(str);
			}
		}
		public static void main(String args[])
		{
			StaticKeyword.MyNestedClass obj= new StaticKeyword.MyNestedClass();
			obj.disp();
		
	}

}
