package reviewday4;

public class OCAType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//DEBUG to check one by one
				int num = 10;
				do {// post=print 10 first then decrease
					                  //10   10-1   9  (alttakinin anlami)
					System.out.print(num-- + " " + num);
				} while (num == 0);
				/*
				 * // What is the result? 
				 * A) 9876543210 
				 * B) 9 
				 * C) 421 
				 * D) 9 10 
				 * E) Nothing is printed
				 * F) 10 9
				 */
		
	}

}
