package homework09;

import java.util.Scanner;

public class review04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Ask user ta enter one of the ‘U’, ’S’, and ‘A’.
//		Then type a program by using “switch statement” to print “United” for ‘U’
//		”States” for ’S’, and “America” for ‘A
//		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter one of the A, B, C, D");
		char num = scan.nextLine().toUpperCase().charAt(0);
		
		switch(num) {
		case 'U' :
			System.out.println("United");
			break;
		case 'S' :
			System.out.println("States");
			break;
		case 'A' :
			System.out.println("America");
			break;
		default :
			System.out.println("not valid");
			break;	
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
