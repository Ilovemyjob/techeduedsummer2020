package homework11;

import java.util.Scanner;

public class Review01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Ask user to enter an integer, if it is less than 10, calculate its square and print it on the console.
//		If it is greater than 10 multiply it by 2 and print it on the console. Otherwise keep the number same
//		and print it on the console
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a integer");
		int a = scan.nextInt();
		
		if(a<10) {
			System.out.println(a*a);
		}else if(a>10) {
			System.out.println(a*2);
		}else {
			System.out.println(a);
		
		}
		
		
		
		
		

	}

}
