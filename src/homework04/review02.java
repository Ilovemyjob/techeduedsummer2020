package homework04;

import java.util.Scanner;

public class review02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Type java code by using if statement. When you enter the initial of the day of a week,
//		output should be all possible names of the days.
//		For example; if the initial is ’S’ output should be “Saturday or Sunday
//		
		Scanner input = new Scanner(System.in);
		System.out.println("day");
		String day = input.next();

		if (day.equalsIgnoreCase("monday")) {
			System.out.println("m");
		} else if (day.equalsIgnoreCase("tuesday")) {
			System.out.println("t");
		} else if (day.equalsIgnoreCase("wednesday")) {
			System.out.println("w");
		} else if (day.equalsIgnoreCase("thuersday")) {
			System.out.println("t");
		} else if (day.equalsIgnoreCase("saturday")) {
			System.out.println("s");
		} else if (day.equalsIgnoreCase("sonday")) {
			System.out.println("s");

		} else {
			System.out.println("not valid");
		}

		String result = day.equalsIgnoreCase("monday") ? "m"
				: day.equalsIgnoreCase("tuesday") ? "t"
						: day.equalsIgnoreCase("wednesday") ? "w"
								: day.equalsIgnoreCase("thursday") ? "t"
										: day.equalsIgnoreCase("saturday") ? "s"
												: day.equalsIgnoreCase("sunday") ? "s"
														: day.equalsIgnoreCase("friday") ? "f"
																: "not valid";
																 System.out.println(result);

																 
																 
																 
		input.close();

	}

}
