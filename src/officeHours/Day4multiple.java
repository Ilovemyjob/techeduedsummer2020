package officeHours;

public class Day4multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * write a method which prints out the numbers from 1 to 33 
but for numbers which are a multiple of 3, print Java instead of number 
and for numbers which are a multiple of 5, print Best instead of the number. 
For numbers which are a multiple by of both 3 and 5, print JavaIsTheBest instead of the number 
 */
		
		int input=33;
		int num1=5;
		count(input,num1);
	}
	public static void count(int input,int num1) {
		for (int i=0;i<=input;i++) {

		if(i%3==0&&i%5==0) {
			System.out.println("JavaIsTheBest");
		}else if(i%3==0) {
			System.out.println("Java");
		}else if(i%5==0) {
			System.out.println("Best");
		}else {
			System.out.println(i);
		}
		
		}
	}
	
}
