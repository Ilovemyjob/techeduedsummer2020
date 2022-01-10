package reviewday2;

import java.util.Scanner;

public class ScannerPractice {

	
	public static void main(String [] args) {
	
				//Creating Scanner Object
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter a string");
				//line 10 will wait for teh user to enter a string
				//when user enter teh string It will continue to run until teh nest scanner object
				String str1=scan.nextLine();
				
				//using the scanner object we can get different type of data from user
				System.out.println("Enter an integer");
				int i=scan.nextInt();
				//double object
				System.out.println("Enter a double");
				double d=scan.nextDouble();
				
				//char inputa
				System.out.println("Enter a char");
				char c=scan.next().charAt(0);
				
				//String input.
				//When we use next() we need to keep using next()
				System.out.println("Enter a string");
				String str=scan.next();
				
				//closing the scanner
				scan.close();	
		
		
		
		
		
	}
	
}
