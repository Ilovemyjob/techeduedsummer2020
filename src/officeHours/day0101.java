package officeHours;

import java.util.Scanner;

public class day0101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("kilo");
		double weight = scan.nextDouble();
		System.out.println("uzunluk");
		double height = scan.nextDouble();
		height= height/100;  // metreye cevirme

		double bmi = weight/(height*height);
		
		if(bmi<20) {
			System.out.println("zayif");
		}else if(bmi<25) {
			System.out.println("saglikli");
		}else if(bmi>25) {
			System.out.println("sisman");
		}
		
		
	}

}
