package day22foreachloopdt;

import java.util.Arrays;

public class Question01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java program to remove a specific element from an array

		int a[] = {12, 11, 23, 7};
		
		int b[] = new int[a.length-1];
		
		int l = 1;
		int k = 0;
		for(int i = 0; i<a.length; i++) {
			if(i==l) {
				continue;
			}
			b[k]= a[i];
			k++;
		}
		System.out.println(Arrays.toString(b));
	}

}
