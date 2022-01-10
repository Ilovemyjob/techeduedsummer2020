package homework07;

import java.util.Scanner;

public class review_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Type java code by using nested if() statement.
//		Ask user to enter a password
//		If the initial of the password is uppercase then check if it is ‘A’ or not. If it is ‘A’ the output will be
//		“Valid Password” otherwise the output will be “Invalid Password”
//		If the initial of the password is lowercase then check if it is ‘z’ or not. If it is ‘z’ the output will be
//		“Valid Password” otherwise the output will be “Invalid Password
//		
		

		Scanner scan = new Scanner(System.in);
		System.out.println("password");
		String pass = scan.nextLine();
		
		char a = pass.charAt(0);
		if(a>='A'&& a<='Z') {
			if(a=='A') {
				System.out.println("valid");
			}else {
				System.out.println("not valid");
			}
			
		}else if(a>='a'&& a<='z') {
			if(a=='z') {
				System.out.println("valid");
			}else {
				System.out.println("not valid");
			}
			
		}else
			System.out.println("not valid");
		
		
		
		
	}

}
