package homework02;

import java.util.Scanner;

public class review8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		7) Type a program which converts the mile to kilometer. Mile value will be
//	entered by user. (Use double)
//	Hint 1: km = mile x 1.6
//	Hint 2: To get double, use nextDouble()
		
		Scanner scan = new Scanner(System.in);
		System.out.println("mile");
		double m = scan.nextDouble();
		double km = m*1.6;
		
		System.out.println(km);
		
		
	}

}
