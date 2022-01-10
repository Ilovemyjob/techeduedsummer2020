package homework13;

import java.util.Scanner;

public class review04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Type java code by using while loop,
//		Write a program that prompts the user to input a positive integer.
//		It should then print factorial of that number.

		Scanner scan = new Scanner(System.in);
		System.out.println("positive number");
		int num = scan.nextInt();
		
		int i=1;
		int mul = 1;
		while(i<=num) {
		//mul = mul * i;
			System.out.print(i + "*");
		i++;
		
		}
		//System.out.print(mul);
	}
		

}
