package homework04;

import java.util.Scanner;

public class warm_up2 {

	public static void main(String[] args) {
		
//		Ask user to enter two integer values. Write a Java Program to swap
		//two numbers by using the third variable.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("2 number");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = 0;
		
		c=a;
		a=b;
		b=c;
		System.out.println(a);
		System.out.println(b);
		
		
	}
	
	
	
}
