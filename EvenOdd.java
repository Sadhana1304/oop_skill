//Java program to check whether a number is even or odd 
package cse;
import java.util.Scanner;
public class EvenOdd {
public static void main(String[] args) {
	int num;
	Scanner sc=new Scanner(System.in);
	num=sc.nextInt();
	if(num%2==0) {
		System.out.println("EvenNumber: "+num);
	}else {
		System.out.println("OddNumber: "+num);
	}
	
}
}
