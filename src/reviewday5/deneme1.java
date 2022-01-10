package reviewday5;

import java.util.Arrays;

public class deneme1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] array = { "sam", "john", "tom" };
		acceptArray(array);
		acceptArray2(array);
		//acceptArray3(array);
		deneme1 obj1 = new deneme1();
		obj1.acceptArray3(array);

	}
	
		public static void acceptArray(String[] array) {
			System.out.println(Arrays.toString(array));
		}
		
		public static void acceptArray2(String[] array) {
			
			for(String w:array) {
				System.out.print(w +" ");
			}
		System.out.println();
		}
			
			public void acceptArray3(String[] array) {
				
				for(String w:array) {
					System.out.print(w +" ");
				}
		
		}
	
}
