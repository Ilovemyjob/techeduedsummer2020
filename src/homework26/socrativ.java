package homework26;

public class socrativ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str2= "LearnJava";// reverse method by loop or by stringbuilder(reverse method)
		String str3= "";
		for(int i=str2.length()-1; i>=0; i--) {
			str3= str3+str2.charAt(i);
		}
	System.out.println(str3);
	}

}
