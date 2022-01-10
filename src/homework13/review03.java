package homework13;

import java.util.Scanner;

public class review03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Type java code by using while loop,
//		Write a program that prompts the user to input a positive integer.
//		It should then print the multiplication table of that number
		
		Scanner scan = new Scanner(System.in);
		System.out.println("positive number");
		int num = scan.nextInt();
		
		int i=1;
		while(i<=10) {
			System.out.println(i +"*"+ num + "="+ i * num );
			i++;
		}
		
		
	}

}
