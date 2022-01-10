package homework21;

import java.util.ArrayList;
import java.util.List;

public class socrates2 {

		public static void main(String[] args) {

			int arr[] = {2, 4, 6, 8};

			List<Integer> list = new ArrayList<>();

			int i = 0;

			do {

				list.add(arr[i]);

				i++;

			} while (i < arr.length);	

			System.out.println(list);

	}
	}


