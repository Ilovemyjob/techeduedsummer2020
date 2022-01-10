package homework25;

public class Review2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb1 = new StringBuilder("animal");
		sb1.insert(0,"X");
		System.out.println(sb1); // Xanimal
		
		sb1.insert(7,"X");
		System.out.println(sb1); // XanimalX
		
		sb1.insert(4,"X");
		System.out.println(sb1); // XaniXmalX
	}

}
