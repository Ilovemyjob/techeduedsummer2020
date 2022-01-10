package homework08;

import java.util.Scanner;

public class rewiev_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Ask user to enter a String. If the String has 2 characters, output will be
//		“It is valid for state abbreviations” Otherwise, output will be “It is not valid for state abbreviations
//		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a String");
		String str = scan.nextLine().toUpperCase();
		
		System.out.println(str);
		
		String result = str.length()==2 ? "valid" : "not valid";
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
