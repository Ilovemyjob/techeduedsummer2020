package homework13;

public class review02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Type java code by using while loop.
//		Write a program that types first 30 consecutive odd integers.

		int i=1;
		int count =0;
		while(count<30) {
			if(i%2!=0) {
				System.out.print(i + " ");
				count++;
			}
			
			i++;
		}
		
		System.out.println();
		System.out.println(count);
		
		
	}

}
