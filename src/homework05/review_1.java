package homework05;

import java.util.Scanner;

public class review_1 {
	public static void main(String [] args) {
		//Ask user to give you an integer, 
		//If the integer is less than 10, print "You won!" on the console
	    //Otherwise, print "You lost!" on the console.
			
        //1. Way: Solve the question by using if-else statement
		//In if-else there is just one condition; because of that
		//Java checks just one condition. But if you use double if, 
		//you will have two conditions to check, it is more task to do.
		//Therefore, we prefer to use if-else instead of double if

		
		Scanner scan = new Scanner(System.in);
		System.out.println("give you an integer");
		int a = scan.nextInt();
		
		if(a < 10) {
			System.out.println("won");
		}else {
			System.out.println("lost");
		}
		
		System.out.println("finish");
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
	
	
	
	
}
