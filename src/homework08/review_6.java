package homework08;

import java.util.Scanner;

public class review_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Ask user to enter an integer. If the number has 3 digits, output will be
//		“This number has 3 digits.” Otherwise, output will be “This number has no 3 digits.”
//		How can you decide the number of digits of an integer?
//		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println(" enter an integer");
		int a = scan.nextLine().length();
		
		 
		String result = a==3 ? "Three digit" : "Not Three Digit";
			System.out.println(result);
		
			System.out.println(a==3 ? "three" : "not three");
		
		
		
		
	}

}
