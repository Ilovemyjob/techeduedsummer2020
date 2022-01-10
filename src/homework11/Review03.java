package homework11;

import java.util.Scanner;

public class Review03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Ask user to enter a letter, if it is uppercase check it is before “F” or not in alphabetical order.
//		If it is before “F” in alphabetical order output will be “ Big before F”, otherwise output will be
//		“Big after F.” If it is lowercase check it is before “h” or not in alphabetical order.
//		If it is before “h” in alphabetical order output will be “Small before h”, otherwise “Small after h”
//		
		Scanner scan = new Scanner(System.in);
		System.out.println("a letter");
		char a = scan.next().charAt(0);
		
		if(a>'A' && a<'Z') {
			if(a<'F') {
				System.out.println("Big before F");
			}else {
				System.out.println("Big after F");
			}
			
		}else if(a>'a' && a<'z') {
			if(a<'f') {
				System.out.println("Small before f");
			}else {
				System.out.println("Small after f");
			}
			}else {
				System.out.println("include not f");
			}
	}
}
