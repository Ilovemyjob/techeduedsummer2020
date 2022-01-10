package day29overridingdt;

public class Dog extends Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog dog = new Dog();
		dog.eat();
	}

	public void sound() {
		System.out.println("Dogs bark");
	}

	public void eat() {
		System.out.println("Eat meat");
	}
}