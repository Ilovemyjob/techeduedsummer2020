package officeHours;

import java.util.Scanner;

public class day02FindingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("String");
		String String= scan.next();
		System.out.println("sentences");
		String s= scan.next();
		
		int count = 0;
		for(int i=0;i<=s.length()-String.length();i++) {
	
			
			if(s.substring(i,i+String.length()).equals(String)) {
				count++;
			}else {
				System.out.println("not valid");
			}
			
		
		}
		System.out.println("there are " +count+ " " + String );
	}

}
