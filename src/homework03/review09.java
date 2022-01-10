package homework03;

import java.util.Scanner;

public class review09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Type a program which asks user to enter his/her first name and last name,
//		then print it on the console.
//		Hint: To get String, use nextLine()
//		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("first name");
		String first = scan.nextLine();
		System.out.println("last name");
		String last = scan.nextLine();
		
		System.out.println(first + " " + last);
		
	}

}
