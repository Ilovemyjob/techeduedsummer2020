package homework05;

import java.util.Scanner;

public class review_2 {
    
	public static void main(String[] args) {
		
		
		// Ask user to give you a char
				// If the char is same with your initial of your first name
				// print "You got it!" on the console;
				// otherwise print "Try again!" on the console.
				
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("give you a char");
		char Initial = scan.nextLine().charAt(0);
		
		if(Initial == 'E') {
			System.out.println("You got it");
		}else {
			System.out.println("Try again!");
		}
	
		
		
		
		
		
	}
	
	
	
}
