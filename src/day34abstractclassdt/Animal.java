package day34abstractclassdt;

public abstract class Animal extends Creature  {

	
		// TODO Auto-generated method stub
		/*
		 1)Inside an abstract class you can use both abstract and concrete methods.
		*/
	
		public static void main(String[] args) {
	
		}
		
		public abstract void eat();
		
		public abstract void sound();
		
		public void drink() {
			System.out.println("Animals drink water");
		}

		
		public void breathe() {
			System.out.println("Animals breathe");

			// TODO Auto-generated method stub
			
		}
		
		

}
