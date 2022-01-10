package homework24;

import java.util.ArrayList;

public class review3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> values = new ArrayList<>();
		
		values.add(4);
		values.add(5);
		values.set(1, 6);
		values.remove(0);
		for(Integer v: values)
			System.out.println(v);
	}

}
