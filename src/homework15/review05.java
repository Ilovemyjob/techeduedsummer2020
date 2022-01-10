package homework15;

import java.util.Scanner;

public class review05 {

	public static void main(String[] args) {
//		 Ask user to enter a number.
//		 If the number is divisible by 10 then print "Won!" on the console
//		 otherwise ask user to enter another number.
//		 Use do-while loop.
		
		Scanner scan = new Scanner(System.in);
		
		int i = 1;
		
		do {
			System.out.println("enter a number");
			i = scan.nextInt();
			
			if(i%10!=0) {
				System.out.println("again");
			}
			
			
		}while(i%10!=0);
		
		System.out.println("won");
	}

}
