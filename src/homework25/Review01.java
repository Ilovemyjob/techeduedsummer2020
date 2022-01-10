package homework25;

public class Review01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		StringBuilder sb = new StringBuilder("animals");
				String sub1 = sb.substring( 3 );				
				System.out.println( sub1 );//mals
				
				String sub2 = sb.substring( 2, 5 );//ima				
				System.out.println( sub2 );
				
				System.out.println(sb.indexOf("n"));//1
				
				int lng = sb.length();//7				
				System.out.println( lng );
				
				char ch = sb.charAt(6);//s				
				System.out.println( ch );
				                                        // appende sona eklenir
				StringBuilder sb1 = new StringBuilder();
				sb1.append("A").append("b");//
				System.out.println(sb1); // Ab
				
				StringBuilder sb2 = new StringBuilder().append("A");//A
				sb2.append("b").append("c");//Abc
				System.out.println(sb2); // Abc
				
				
		
		
	}

}
