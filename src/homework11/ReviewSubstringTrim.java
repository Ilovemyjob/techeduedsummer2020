package homework11;

public class ReviewSubstringTrim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Cat, caterpillar";
		String str1 = str.toUpperCase();
		String str2 = str.toLowerCase();
		String str3 = str.substring(4).toLowerCase();
		String str4 = str.substring(3,8).toUpperCase();
		String str5 = str.toUpperCase().toLowerCase();
		String strA = "Cat ";
		String str6 = strA.trim();
		String strB = " Cat";
		String str7 = strB.trim();
		String strC = " Cat ";
		String str8 = strC.trim();
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		System.out.println(str6);
		System.out.println(str7);
		System.out.println(str8);
		
		
		
	}

}
