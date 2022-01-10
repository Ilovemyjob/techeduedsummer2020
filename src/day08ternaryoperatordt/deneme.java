package day08ternaryoperatordt;

public class deneme {

	public static void main(String[] args) {
		
		
		String name = "Ali";
		
		String result = name.contains("Ali") ? (name.toLowerCase().charAt(0)=='a' ? "Good" : "Bad") : ("The worst");
		
		System.out.println(result);
	}
}
