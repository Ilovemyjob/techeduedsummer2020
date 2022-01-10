package homework20;

import java.util.Arrays;

public class review2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		Find the product of the last elements in the array elements of the
//		given multi dimensional array { {1,2,3}, {4,5}, {6} }
		
		int mda[][] = { {1,2,3}, {4,5}, {6} };
         System.out.println(Arrays.deepToString(mda));
         System.out.println(Arrays.toString(mda[2]));// answer
         System.out.println(Arrays.toString(mda[0]));
         System.out.println(mda[0][1]);
         
		
	}

}
