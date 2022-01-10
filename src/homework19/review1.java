package homework19;

import java.util.Arrays;

public class review1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {2, 1, 7, 6};
		Arrays.sort(arr); 
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
		String str[] = {"Ali", "Ahmet", "Kemal", "Can"};
		Arrays.sort(str);
		for(int i=0; i<str.length; i++) {
			System.out.print(str[i] + " ");
		}
		
		
	}

}
