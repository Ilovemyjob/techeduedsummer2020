package homework05;

import java.util.Scanner;

public class review_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Ask user to give you the quantity of the products and the 
		// unit price of the product.
		// If the quantity is more than 1000, print "You got 10% discount" and print
		// the total price on the console.
		// Otherwise, print "No discount" and print the total price on the console
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("give you the quantity of the products");
		int quantity = scan.nextInt();
		System.out.println("unit price of the product");
		int unit = scan.nextInt();
		
		if(quantity > 1000 ) {
			System.out.println("You got 10% discount");
			System.out.println(0.9 * quantity * unit);
		}else {
			
			System.out.println("No discount");
		}
		
	
	
		
		
	}

}
