package officeHours;

public class Day1501ReverseStringWithArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 
         * Write a Java program that reverse a sentence by using Array
         * (with all spaces and special characters)
         * 
         * Input  : Coding is greate.
         * Output : .etaerg si gnidoC
         * 
         */
		
		String str= "Coding is greate.";
		String reverse = "";
		
		String arr[]= str.split("");
		for(int i=arr.length-1;i>=0;i--) {
			reverse+=arr[i];
			System.out.print(arr[i]);
		}
		System.out.println();
		System.out.println(reverse);	
		
		
	//	2. way
		char [] arr1 = str.toCharArray();   // like split()
        for (int i = arr1.length-1; i >=0 ; i--) {
            System.out.print(""+arr1[i]);
        }

	}

}
