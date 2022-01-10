package homework19;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Type a program like; given an array whose length is 3, return an array with the
//				elements "rotated left"
//				For example; if the array is [1, 2, 3] output will be [2, 3, 1]
		
		
		int myArray[] = {1, 2, 3};
		
		for(int i=myArray.length-1; i>=0; i-- ) {
			System.out.print(myArray[i] + " ");
		}
		
	}

}
