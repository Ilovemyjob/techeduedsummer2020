package homework02;

import java.util.Scanner;

public class review6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		5) Type a program which calculates the area and the perimeter of a circle
//	whose radius is entered by user. (Use float)
//	Hint 1: Take pi number as 3.14159
//	Hint 2: Area of a circle is 3.14159 x radius x radius
//	Hint 3: Perimeter of a circle is 2 x 3.14159 x radius
//	Hint 4: To get float, use nextFloat()
		Scanner scan = new Scanner(System.in);
		System.out.println("radius");
		float r=scan.nextFloat();
		
		System.out.println("Area:" +r*r*3.14159);
		System.out.println("Perimeter:"+2*r*3.14159);
	}

}
