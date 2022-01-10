package homework20;

import java.util.Arrays;

public class socrative_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr []= {3,2,3,4,4,5};
		Arrays.sort(arr);
		int count = 0;
		      for (int i=0; i<arr.length; i++) {
		    	  if(arr[i]==3) {
		    		  count++;
		    	  }
		    	  
		      }
		System.out.println(count);
	}

}
