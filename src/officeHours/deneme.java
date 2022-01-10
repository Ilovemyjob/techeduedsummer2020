package officeHours;

public class deneme {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int input = 44;
	int divisor = 5;
	division(input,divisor);
	}
	public static void division(int input,int divisor) {
		int remainder=input;
		int quotient=0;
		while(remainder>divisor) {
	       remainder-=divisor;
	       quotient++;
		
		}
		System.out.println(remainder+ "     "+ quotient);

	}
	
	
}
