package homework02;

import java.util.Scanner;

public class review4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		3) Type a program which calculates the area and the perimeter of a rectangle
//	whose length and with are entered by user.
//	Hint 1: Area of a rectangle is width x length
//	Hint 2: Perimeter of a rectangle is 2x (width + length)
		
		Scanner scan= new Scanner(System.in);
		System.out.println("length");
		int a = scan.nextInt();
		System.out.println("width");
		int b = scan.nextInt();

		System.out.println("Area of a rectangle:"+ a*b);
		System.out.println("Perimeter of a rectangle:" +2*(a+b));
		
		
		
		
	}

}
