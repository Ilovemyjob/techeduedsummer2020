package homework08;

import java.util.Scanner;

public class review_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Type java code by using ternary and if-else. Ask user to enter two integers
//		Write a program to print the minimum one on the console.
//		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter two integers");
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		if (a>=b) {
			System.out.println(b);
		}else {
			System.out.println(a);
			
		}
		
		
		int review = a>=b ? b : a;
		System.out.println(review);
		
		
		
		
		
		scan.close();
		
		
		
		
	}

}
