package homework11;

public class ReviewLastindexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Cat, caterpillar";
		
		int idx1 = str.lastIndexOf("a");
		int idx2 = str.lastIndexOf("at");
		int idx3 = str.lastIndexOf("s");
		int idx4 = str.lastIndexOf("CAT");
		int idx6 = str.lastIndexOf("pars");
		int idx7 = str.lastIndexOf("a" , 3 );
		int idx8 = str.lastIndexOf("a" , 5 );
		int idx9 = str.lastIndexOf("at", 2);
		int idx10 = str.lastIndexOf("at", 7);
		
		System.out.println(idx1);
		System.out.println(idx2);
		System.out.println(idx3);
		System.out.println(idx4);
	
		System.out.println(idx6);
		System.out.println(idx7);
		System.out.println(idx8);
		System.out.println(idx9);
		System.out.println(idx10);
	}

}
