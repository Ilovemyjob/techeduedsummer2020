package homework04;

import java.util.Scanner;

public class review04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		 Type java code by using if statement. When you enter the name of the day of a week,
//		 output will be “Weekday” or “Weekend day” according to the name of the day
//		
		Scanner input = new Scanner(System.in);
		System.out.println("day");
		String day = input.next();

		if (day.equalsIgnoreCase("monday")) {
			System.out.println("Weekday");
		} else if (day.equalsIgnoreCase("tuesday")) {
			System.out.println("Weekday");
		} else if (day.equalsIgnoreCase("wednesday")) {
			System.out.println("Weekday");
		} else if (day.equalsIgnoreCase("thuersday")) {
			System.out.println("Weekday");
		} else if (day.equalsIgnoreCase("saturday")) {
			System.out.println("Weekend day");
		} else if (day.equalsIgnoreCase("sonday")) {
			System.out.println("Weekend day");

		} else {
			System.out.println("not valid");
		}
		
		
	}

}
