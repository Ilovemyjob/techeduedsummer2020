package day15dowhileloopdt;

import java.util.Scanner;

public class DoWhile06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Ask user to enter his first name
//		 If the length of his first name is greater than 6 print "Long name"
//		 otherwise print "Normal name" and finish the loop
//		
		Scanner scan = new Scanner(System.in);
		String name = "";
		
//		do{
//			System.out.println("enter ");
//		    if(name.length()>6) {
//		    	System.out.println("long");
//		    }
//			
//		}while(name.length()<=6);
//		System.out.println("short");
		
		
		
		
		do {
			System.out.println("name");
			name= scan.next();
			if(name.length()>6) {
				System.out.println("long");
			}
			
			
		}while(name.length()>6);
		
		System.out.println("normal name");
		scan.close();
		
	}

}
