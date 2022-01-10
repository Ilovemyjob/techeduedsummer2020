package homework09;

import java.util.Scanner;

public class review02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a Java program user will choose answer among A, B, C, or D.
//		If the answer is true, output will be “True.” If the answer is false, output will be
//		“False”. Correct answer is ‘C’ for the multiple option question
//		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Benim adim ne?");
		System.out.println("A)Ali");
		System.out.println("B)Veli");
		System.out.println("C)Emrah");
		System.out.println("D)Suleyman");
		char a = scan.nextLine().toUpperCase().charAt(0);
		
		switch(a) {
		case 'A' :
			System.out.println("yanlis");
			break;
		case 'B' :
			System.out.println("yanlis");
			break;	
		case 'C' :
			System.out.println("dogru");
			break;
		case 'D' :
			System.out.println("yanlis");
			break;
		default :
		    System.out.println(" adam akilli bassan tusa");
		
		
		
		
		}
		
		
		
		
		
	}

}
