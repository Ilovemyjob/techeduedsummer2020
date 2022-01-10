package reviewday4;

public class WarmUp {

	public static void main(String[] args) {
		
		//Print even numbers between 1-20 inclusive e.g.2 4 6 .. 20 
				for (int i = 1; i <= 20; i++) {
					if (i % 2 == 0) {
						System.out.print(i + " ");
					}
				}
				System.out.println();// to go to next line
				for (int j = 1; j <= 10; j++) {
					System.out.print(2 * j + " ");
				}
				System.out.println();
		//Print odd numbers between 1-20 inclusive.e.g 1,3,5,7,...,19  Including comma
				for (int k = 1; k <= 20; k++) {
					if (k % 2 != 0) {
						if (k < 19) {
							System.out.print(k + ",");
						} else if (k >= 19) {
							System.out.println(k);
						}
					}
				}
		//Print all number that is divisible by 5 backward from 20-1 inclusive e.g.20,15,10,5
				for (int m = 20; m >= 1; m--) {
					if (m % 5 == 0) {// if m is divisible by 5
						if (m > 5) {
							System.out.print(m + ",");
						} else {
							System.out.println(m);
						}
					}
				}
		//Find the sum of all even numbers form 1 - 20 inclusive
				int sum = 0;
				for (int k = 1; k <= 20; k++) {
					if (k % 2 == 0) {
						sum += k;
					}
				}
				System.out.println(sum);
				int num = 1;
				int sum1 = 0; 
				while (num <= 20) {
					num++;// for some codes where you put this increment makes difference
					if (num % 2 == 0) {
						sum1 += num;
					}
					//num++=====>   burdada olabilir
				}
				System.out.println(sum1);
		//Print all numbers from 1-20 except 11 or 15
				// use break or continue
				for (int i = 1; i <= 20; i++) {
					if (i == 11 || i == 15) {
						continue;// Difference between break and continue?
						// with break, java will get pout of the loop
						// with continue, java will just skip that condition and continue the loop
					} else {
						System.out.print(i + " ");
					}
				}
				
				System.out.println();//go to the next line
				
				for (int r = 1; r <= 20; r++) {
					if (r != 11 && r != 15) {
						System.out.print(r + " ");
					}
				}
		
		System.out.println();
		for (int a=1 ;a<=20;a++) {
			if(a==11||a==15) {
				continue;
			}
		System.out.print(a +" ");
		}
		
		
		
		
		
		
		
	}
	
	
	

	
}
