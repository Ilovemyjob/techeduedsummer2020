package homework11;

import java.util.Scanner;

public class Review08 {

	public static void main(String[] args) {
		// Ask user ta enter his/her first name, last name and Social Security Number.
//		Then type a program which makes
//		a) initials of the first name and the last name in uppercase,
//		other characters will be in lowercase.
//		b) all characters except last 4 characters of the Social Security Number “ * ”.
//		For example; Suleyman Alptekin *****5678
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("first name");
		String first = scan.nextLine();
		
		System.out.println("last name");
		String last = scan.nextLine();
		
		System.out.println("security number");
		String number = scan.nextLine();
		
		 System.out.println(first.substring(0,1 ).toUpperCase() + first.substring(1));
		
		 System.out.println(last.substring(0,1 ).toUpperCase() +last.substring(1));
		 
		 
		 
		System.out.println("****" + number.substring(4, 8));
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	

}
