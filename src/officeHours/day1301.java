package officeHours;

public class day1301 {

	public static void main(String[] args) {
	/*
	 * Write a return method that accepts an integer as input and calculates and prints factorial    
Eg : Input : 6
     Output: 6!=6*5*4*3*2*1=720	
	 */

        int input =6;
        factorial(input);
    }
    
    public static void factorial(int input) {
        
        System.out.print(input + "!=");
        int fact=1;
        for (int i = input; i >1; i--) {
            
            System.out.print(i+"*");
            fact*=i;
        }
        System.out.print("1=" + fact);

		
		
		
		
		
	}
}
