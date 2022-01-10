package homework09;

import java.util.Scanner;

public class review01 {
	public static void main(String[] args) {
	
	
//	If the user pressed 1, 2, 3 the program will 
	//print the number that is pressed;
//	otherwise, program will print "Not allowed"
//	
     Scanner scan = new Scanner(System.in);
     System.out.println("enter a number");
     int num = scan.nextInt();
     
     switch(num){
    	 case 1 :
    		 System.out.println(1);
    		 break;
    	 case 2 :
    		 System.out.println(2);
    		 break;
    	 case 3 :
    		 System.out.println(3);
    		 break;
    	default :
    		System.out.println("not allowed");
    	 
     }
	
		if(num==1) {
			System.out.println(1);
		}else if(num==2) {
		System.out.println(2);
		}else if(num==3) {
			System.out.println(3);
		}else
		System.out.println("not allowed");
		

		int a = 1;
		System.out.println(a==1?"One":a==2?"Two":a==3?"Three":"Not allowed.");

		
		System.out.println(num == 1 || num == 2 || num == 3 ? num : "not allowed");
		
		System.out.println(a==1?"One":a==2?"two":a==3?"three":"not allowed");
		
		
	}
}
