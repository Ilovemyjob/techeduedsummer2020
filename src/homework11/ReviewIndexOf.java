package homework11;

public class ReviewIndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Cat, caterpillar";
				
				int idx1 = str.indexOf("c");
				int idx2 = str.indexOf("cat");
				int idx3 = str.indexOf("s");
				int idx4 = str.indexOf("CAT");
				int idx5 = str.indexOf("ter");
				int idx6 = str.indexOf("pars");
				int idx7 = str.indexOf("a" , 3 );
				int idx8 = str.indexOf("at", 2);
				int idx9 = str.indexOf("at", 8);
				
				System.out.println(idx1);
				System.out.println(idx2);
				System.out.println(idx3);
				System.out.println(idx4);
				System.out.println(idx5);
				System.out.println(idx6);
				System.out.println(idx7);
				System.out.println(idx8);
				System.out.println(idx9);
		
						
						
	}

}
