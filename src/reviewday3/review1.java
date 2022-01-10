package reviewday3;

public class review1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Write a code using ternary: Create int variable : price 
		 * Create string
		 * variable : decision If the price <= $10 
		 * Print “cheap” 
		 * If price is 10-$20 print“ok” 
		 * Otherwise “expensive”.
		 */
		
		int price = 5;
		String decision;
		
		if(price>=1&&price<=10) {
			decision="cheap";
			//System.out.println("cheap");
		}else {
			if(price>=11 && price <=20) {
				decision="ok";
			}else {//price will be more than 20
				decision="expensive";
			}
		}
		
		System.out.println("Decission with if "+decision);
		
		//SOLVING WITH TERNARY
		decision=(price>=1&&price<=10)?"cheap" 
				:(price>=11 && price <=20)?"ok"
						:"expensive";
		System.out.println("Decision with ? "+decision);
		
		
	// 	decision = (price>=1&&price<=10)?"cheap":(price>=1&&price<=10)?"ok":"expensive";
	}

	
	
}
