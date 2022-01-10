package day35interfacedt;

public abstract class Hotel {
	int a;
	

	
	
		// TODO Auto-generated method stub
/*
 * 1)In a hotel, breakfast with different foods and daily room cleaning are mandatory for all type
  of rooms .
 2)In the hotel there are "single", "family", and "King" rooms. 
 3)Breakfast in the room is optional for all rooms
 4)For King room tea services are mandatory twice in a day.
 */
	
	
	public abstract void breakfast();
	public abstract void clean();
	public void bInRoom() {
		System.out.println("Breakfast in room is 20 dollars");

//	public abstract void breakfast();
//	public abstract void clean();
//	public void bRoom() {
//		System.out.println("20 dolar");
	}
	
}
