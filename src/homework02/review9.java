package homework02;

import java.util.Scanner;

public class review9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		8) Type a program which converts the hours to seconds. Hours value will be
//	entered by user. (Use long)
//	Hint 1: second = hour x 60 x 60
//	Hint 2: To get long, use nextLong()
		Scanner scan = new Scanner(System.in);
		System.out.println("hour");
		long hour = scan.nextLong();
		
		long second = hour * 60*60;
				System.out.println(second);
	
		
		
		
	}

}
