package officeHours;

public class Day4Division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * write a return method that can  divide two numbers 
 * without division operator and prints quotient and remainder 

Input : number= 44 and divisor=5
Output : Quotient=8 Remainder=4 

 */
int input = 44;
int division = 5;
division(input,division);
		
		
	}

	public static void division(int input,int division) {
		int quotient=0;
		int remainder=input;
		while(remainder>division) {
			remainder-=division;
			quotient++;
		}
		System.out.println("Quotient: "+quotient+" Remainder: "+remainder );
	}
	
	
}
