package officeHours;

public class Day5Avarage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		write a java program that calculates the average value of array elements
//
//		input[]= {1,2,3,4,5,6,7}
//		Output : 4
		
	//	int arr[]=new int[6];
		
		int input[] = {1,2,3,4,5,6,7};
		int sum=0;
		
		for(int each:input) {
			sum+=each;
			
		}
		double avarage=sum/input.length;
       System.out.println(avarage);
	
	
	
	}
	

}
