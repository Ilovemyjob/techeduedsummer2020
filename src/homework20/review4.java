package homework20;

import java.util.Arrays;

public class review4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Find the sum of the elements in the array elements of the given multi dimensional array
//		{ {1,2,3}, {4,5}, {6,7} } and return an array.
//		For example; for { {1,2,3}, {4,5}, {6,7} } output will be {6, 9, 13}
		
		int mda[][] = { {1,2,3}, {4,5}, {6,7} };
		
		int c = mda[2][0]+mda[2][1];
		int b = mda[1][0]+mda[1][1];
		int a = mda[0][0]+mda[0][1]+mda[0][2];
		
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	
//	int mda1[] = new int [3];
//		mda1[0]=a;
//		mda1[1]=b;     // long way to solve
//		mda1[2]=c;
		
		
		int mda1[] = {a,b,c};
		System.out.print(Arrays.toString(mda1));
		
		
		
		System.out.println();
		//busoruyu bulamadim
		int[][] arr1 = {{1, 2, 3}, {4, 5}, {6, 7}};
		 int[] arr2 = new int[arr1.length];
        int sum = 0;
    for (int i = 0; i < arr1.length; i++) {
        for (int k = 0; k < arr1[k].length; k++) {
            	sum += arr1[i][k];
            	if (i==0) {
            		int sum1 = 0;
            		sum1+=sum;
            				System.out.println(sum1);
            		sum=0;		
            	}else if (i==1) {
            		int sum2 = 0;
            		sum2+=sum;
            				System.out.println(sum2);
            				sum=0;
            	}else  if(i==2) {
            		int sum3 = 0;
            		sum3+=sum;
            				System.out.println(sum3);
            				sum=0;
            	}
         
        }
        
        
        
    }
       

		
		
		
	
	
	
	}

}
