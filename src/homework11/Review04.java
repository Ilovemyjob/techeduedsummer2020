package homework11;

import java.util.Scanner;

public class Review04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Ask user ta enter his/her first and last name. If the first name is longer
//		output will be “First name is longer.” If the length of last name is equal
//		To the length of last name output will be “First name and last name
//		have same length.” Otherwise, output will be “Last name is longer
//		
		Scanner scan = new Scanner(System.in);
		System.out.println("first name");
		String first = scan.nextLine();
		System.out.println("second name");
		String second = scan.nextLine();
		
		if(first.length() > second.length()) {
			System.out.println("First name is longer.");
		}else if(first.length() == second.length()) {
			System.out.println("First name and last name have same length.");

		}else {
			System.out.println("Last name is longer");
		}
		
		
	}

}
