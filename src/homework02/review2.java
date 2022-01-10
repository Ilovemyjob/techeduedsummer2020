package homework02;

import java.util.Scanner;

public class review2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1) Type a program which calculates the area and the perimeter of a square
//	whose side length is entered by user.
//	Hint 1: Area of a square is length x length
//	Hint 2: Perimeter of a square is 4x length
//	
	Scanner scan= new Scanner(System.in);
	System.out.println("length");
	int lenght = scan.nextInt();
	
	System.out.println("Area of a Square :" + lenght*lenght);
	System.out.println("Perimeter of a square :"+ 4*lenght);
	
	 
	}

}
