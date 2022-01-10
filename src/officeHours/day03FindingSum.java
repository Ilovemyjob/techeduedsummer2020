package officeHours;

public class day03FindingSum {
	static int sum=0; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//  Write a method that accepts an array as parameter and returns sum off all elements in the array
	//  Then print the result, in the main method 
	//  Eg : input : {1,2,3,4,5,6,7,8};
//	       output: 36
      int input[]={1,2,3,4,5,6,7,8};//call method to use var. in method
	                                // make sum static but  write call method up
      
      sum(input);
    System.out.println(sum);
	
	}
	 
		public static int sum(int input[]) {
		
		for(int each:input) {
			sum+=each;
			
		}
		return sum ;

		}
		
		
		
		
		
	

}
