package officeHours;

public class Day5MaxValueMultidimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		write a method that accepts a 2 dimensional array and finds the max value
//
//		Input : {{1,2,3},{4,5},{6,7,8}}
//		Output : 8
		
		int input[][]={{1,2,3},{4,5},{6,7,8}};
		
		
		
		System.out.println(maxValue(input));
		
	}

	public static int maxValue(int input[][]) {
		int max=input[0][0];
		for(int i=0;i<input.length;i++) {
			for (int j = 0; j < input[i].length; j++) {
				if (max< input[i][j]) {
					max=input[i][j];
				}
			}
			
		}
		return max;
		
		
	}
}
