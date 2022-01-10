package homework11;

import java.util.Scanner;

public class Review07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Ask user to enter password, if the password is okay for the following conditions output will be
//		“Your password is created successfully.” If the password is not okay for any of the following conditions
//		Output will be “Enter a new password according to the give conditions”
//		1.First letter must be uppercase
//		2.Last letter must be lowercase
//		3.Password must contain 6 characters
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a Password");
		String str = scan.next();

		if((str.length()==6) && (str.charAt(str.length()-1)>='a') && (str.charAt(str.length()-1)<='z') && (str.charAt(0)>= 'A') && (str.charAt(0)<= 'Z')) {
			System.out.println("valid");
		}else
		System.out.println("not valid");
	}

}
