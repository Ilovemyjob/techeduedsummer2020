package homework25;

public class Review3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder sb1 = new StringBuilder("abcdef");
		
		sb1.delete(1, 3);//adef
		System.out.println(sb1);
		
		StringBuilder sb2 = new StringBuilder("abcdef");
		sb2.deleteCharAt(2);//abdef
		System.out.println(sb2); // 
		sb2.deleteCharAt(4); // throws an exception
		System.out.println(sb2);
	}

}
