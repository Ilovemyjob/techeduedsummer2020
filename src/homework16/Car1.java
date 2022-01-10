package homework16;

public class Car1 {

	// slide 16 soru 1 ve 2 
	int price$;
	String make;
	String model;
	
	public Car1() { // this.price$; olamyacak yada this.price=10(price degil) olacak
		this.price$=price$ ;
//		this.make="Honda";
//		//this.model;
}
	
	public static void main(String[] args) {
		// TODO Ao-generated method stub

		Car1 c1  = new Car1(); 
		c1.price$=7000;
		System.out.println(c1.price$);
		
	
	}

}
