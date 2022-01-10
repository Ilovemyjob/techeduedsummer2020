package officeHours;

public class Day5MaxAndMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		write a method that accepts an integer array as input and
		//prints the minimum and the maximum numbers from given array
//
//
//		Input : {3,2,5,4,1,6}
//		Output : min: 1  max : 6
		
		int Input[]={3,2,5,4,1,6};
		
		minAndMax(Input);
		minAndMax1(Input);
		
	}

	public static void minAndMax(int input[]) {
		int max=input[0];
		int min=input[0];
		
		for(int each:input) {			
			if(each>max) {
				max=each;
				
			} if(each<min) {
				min=each;
			}
					
		}
		System.out.print(max +" ");
        System.out.println(min);
	}
	
	public static void minAndMax1(int input[]) {
		int max=input[0];
		int min=input[0];

		for(int i=0;i<input.length;i++) {
			if(max<input[i]) {
				max=input[i];
			}if(min>input[i]) {
				min=input[i];
			}
		
		
		}
		
		System.out.print(min + " ");
		System.out.println(max);
		
		
		
		
		
		
		
		
		
		
	}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	