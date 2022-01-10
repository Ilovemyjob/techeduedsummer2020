package homework16;

public class Car {
	
	int price$;
	String make;
	String model;
	
	public Car(int price$, String make, String model) {
		
		this.price$=price$;
		this.make=make;
		this.model=model;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Car car1 = new Car();   ===> there is not a default constructor
		
		Car car2 = new Car(500,"Audi","Q5");
		System.out.println(car2.make);
		System.out.println(car2.price$);
		System.out.println(car2.model);
		
		Car car3 = new Car(4000, "GMC", "Yukon");
		System.out.println(car3.make);
		System.out.println(car3.price$);
		System.out.println(car3.model);
	}

}
