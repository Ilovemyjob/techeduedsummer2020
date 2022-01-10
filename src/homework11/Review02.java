package homework11;

import java.util.Scanner;

public class Review02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Ask user to enter his kid’s name, if the name contains “a” output will be “This name contains ‘a’.”
//		if the name contains “z” output will be “This name contains ‘z’.” Otherwise, output will be
//		“This name contains neither ‘a’ nor ‘z’.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("kid's name");
		String a = scan.nextLine();
		if(a.contains("a")) {
			System.out.println("This name contains 'a' ");
		}else if(a.contains("z")) {
			System.out.println("This name contains 'z'");
		}else {
			System.out.println("This name contains neither a, b ");
		}
		
		
		
	}

}
