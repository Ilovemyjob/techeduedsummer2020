package homework08;

import java.util.Scanner;

public class review_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Ask user ta enter a number. If the number is less than 10 and greater
//		than or equal to 0, calculate its cube. Otherwise, calculate its square.
//		Cube of a = a*a*a Square of a = a*a
//		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");
		
		int a = scan.nextInt();
		
		int result = a<10 && a>=0 ? a*a*a : a*a;
		System.out.println(result);
		
		System.out.println(a<10 && a>=0 ? a*a*a : a*a);
		
		if(a<10 && a>=0) {
			System.out.println(a*a*a);
		}else {
			System.out.println(a*a);
		}
		
		
		
		
	}

}
