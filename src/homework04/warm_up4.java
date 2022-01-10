package homework04;

import java.util.Scanner;

public class warm_up4 {

	public static void main(String[] args) {
		
//		3) Ask user to enter a 4 digits integer, then print the sum of the first
//		and the last digit of the number on console.
//		For example; if user enters 1234 you will add 1 and 4,
//		then print on the console 5
		
		Scanner scan = new Scanner(System.in);
		System.out.println("4 digit number");
	    int number = scan.nextInt();
		//String number = scan.next();
////		
		int a = number%10;
		int b = number/1000;
//		
		
	   //
//		char a = number.charAt(0);
//		char b = number.charAt(3);  2. way create string and get the number 
////		
		System.out.println(a+" "+ b  );
		
		scan.close();
	}
	
	
	
}
