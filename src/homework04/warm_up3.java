package homework04;

import java.util.Scanner;

public class warm_up3 {

	public static void main(String[] args) {
		
//		Ask user to enter two integer values. Write a Java Program to swap
		//two numbers without using the third variable.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("2 number");
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);
		
	}
	
	
	
}
