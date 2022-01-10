package homework22;

public class review3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Write a Java program to find the common elements between two
//		arrays (string values)
//		
		
		
		String arr1[] = { "a", "b", "c"};
		String arr2[] = { "d", "b", "c"};
       
		for(String w1 : arr1) {
			for(String w2 : arr2) {
				if(!(w1.equals(w2))) {
					continue;
				}
				
			System.out.print(w1 + " ");
			
			}
			
		}
		
		
	}

}
