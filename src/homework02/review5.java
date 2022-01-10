package homework02;

import java.util.Scanner;

public class review5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		4) Type a program which calculates the volume of a rectangular prism
//	whose length, with, and height are entered by user.
//	Hint 1: Volume of a rectangular prism is width x length x height
		
		Scanner scan= new Scanner(System.in);
		System.out.println("length");
		int a = scan.nextInt();
		System.out.println("width");
		int b = scan.nextInt();
		System.out.println("height");
		int c = scan.nextInt();
		
		System.out.println(a*b*c);
		
		
		
	}

}
