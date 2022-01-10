package officeHours;

public class Day4Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * write a return method to reverse number 
Input   : 12345
Output : 54321
 */
		int input=12345;
		
		System.out.println(reverse(input));
	}
	public static int reverse(int input) {
		 
		
		int reservenum=0;
		
		
		while(input>0) {
			reservenum=reservenum*10+input%10;
			input=input/10;
			
		}
		
		
		
	return reservenum;
	}
	
	

}
