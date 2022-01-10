package day27inheritancedt;

public class Animal {
	public boolean breathe = true;
	//private variables or methods cannot be inherited
	//Because private things cannot be accessed from other classes
	private String type = "Animal"; // cannot use in other class
	
	public static void main(String[] args) {

	}
	
	public void eat() {
		System.out.println("They eat");//inheritance method
	}
	public void drink() {
		System.out.println("They drink");
	}
	public void move(){
		System.out.println("They move");

	}
	
}
