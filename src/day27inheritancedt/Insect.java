package day27inheritancedt;

public class Insect extends Animal {
	boolean poisonous = true;// inharit variable

	
		public static void main(String[] args) {
			
			Insect insect = new Insect();
			System.out.println("Can insects breathe? " + insect.breathe); // variable call
			System.out.println("Are insects poisonous? " + insect.poisonous);
			
			insect.drink();   ////inharit method call
			insect.eat();
			insect.invisible();
			insect.move();
			}


	public void invisible() {  //inharit method
		
		System.out.println("Some insects are invisible");
	}
}
