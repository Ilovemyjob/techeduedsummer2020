package homework13;

import java.util.Scanner;

public class review06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Type java code by using while loop,
//		Write a program that prompts the user to input an integer.
//		It should then find sum of the digits of that number
		
		Scanner scan = new Scanner(System.in);
		System.out.println("positive number");
		int num = scan.nextInt();
		
		int i=1;
		int sum = 0;
		while(i>0) {
			int lastdigit = num%10;
			num = num/10;
			sum = sum + lastdigit;
			
			i++;
		}
		System.out.println(sum);
		scan.close();
	}

}
