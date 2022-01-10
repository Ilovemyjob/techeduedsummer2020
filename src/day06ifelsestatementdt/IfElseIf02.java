package day06ifelsestatementdt;

import java.util.Scanner;

public class IfElseIf02 {
	
	public static void main(String[] args) {
		/*
		 Ask user to give two integers
		 Type java code by using if-else if() statement, 
         If both of the two integers are positive, output will be 
         the sum of them. 
         If both of the two integers are negative, output will be 
         the multiplication of them.
         Otherwise; output will be “I cannot add or multiply”
		*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Give two integers");
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		if(a>0 && b>0) {
			System.out.println(a+b);
		}else if(a<0 && b<0) {
			System.out.println(a*b);
		}else {
			System.out.println("I cannot add or multiply");
		}
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter 2 number");
//		int num1 = scan.nextInt();
//		int num2 = scan.nextInt();
//		
//		if(num1>0 && num2>0) {
//			System.out.println(num1 + num2);
//		}else if(num1<0 && num2<0) {
//			System.out.println(num1 * num2);
//		}else {
//			System.out.println("not add not multiply");
//		}
		
		
		
		
		scan.close();
	}
}