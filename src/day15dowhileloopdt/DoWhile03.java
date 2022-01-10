package day15dowhileloopdt;

import java.util.Scanner;

public class DoWhile03 {

	public static void main(String[] args) {
		// Ask user to enter a number
				// If the number user entered is less than 10 print "Won!" on the console
				// otherwise ask user to enter a number again.
				
				Scanner scan = new Scanner(System.in);
				
				int i = 1;		
				do {			
					System.out.println("Enter a number");
					i = scan.nextInt();	
				}while(i>=10);
		
				System.out.println("Won!");
				
			
				scan.close();

//	Scanner scan = new Scanner(System.in);
//	int m = 1;
//	do {
//		System.out.println("numara gir");
//		m = scan.nextInt();
//		
//	}while(m>=10);
//	System.out.println("kazandin");
//	
	
	}

}
