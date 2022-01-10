package homework15;

import java.util.Scanner;

public class review07 {

	public static void main(String[] args) {
//		Ask user to enter a String
//		Print the characters whose indexes are odd on the console
//		For example; Germany ==> e m n
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a String");
		
		String str =  scan.next();
		int i = 1;
		
		do {
			
			
			if(str.length()>i) {	
				
				System.out.print(str.charAt(i) + " ");
			
			}
			i=i+2;
		
		}while(str.length()>i);
		
		
		
		
	}

}
