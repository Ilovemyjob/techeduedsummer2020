package homework03;

import java.util.Scanner;

public class review10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		Type a program which asks user to enter his/her full name, and address
//		then print them on the console like the full name should be in the first line,
//		and the address will be in the second line.
//		Hint: To get String, use nextLine()
	
	Scanner scan = new Scanner(System.in);
	System.out.println("full name");
	String name = scan.nextLine();
	System.out.println("address");
	String address = scan.nextLine();
	
	System.out.println(name);
	System.out.println(address);
	
	
	}
	
	

}
