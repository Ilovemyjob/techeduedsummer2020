package officeHours;

import java.util.Scanner;

public class day0102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("how many tea do you drink in a day ");
		double tea = scan.nextDouble();
		System.out.println("how many sugar do you use ");
		double sugar = scan.nextDouble();

		double year = tea*sugar*360/1000;
		double year40 =year*40;
		
		int yearint = (int)year;
		int year40int = (int)year40;
	//	double year40 =year*40;
		
		if(sugar==0) {
			System.out.println("good");
		}else 
			
			System.out.println("year :" + yearint + "kg");
		System.out.println("40 year :" + year40int +"kg");
				
			
		}
		
		
	}


