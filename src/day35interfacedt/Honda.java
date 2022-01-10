package day35interfacedt;

public class Honda implements Engine, AirCondition,Gas{

	/*
	 1)When you make a concrete class child of an interface
	   use "implements" keyword instead of "extends"
	 2)In parent interfaces you can use variables whose names are same
	   When you call the variables you have to use interface names
	   otherwise you will get CTE.  
	*/

	public static void main(String[] args) {
     //  Honda hondaCar = new Honda();
       Engine hondaCar2 = new Honda(); // we can not write bec of air condition we get cte /air condition must be selected
       Honda hondaCar = new Honda();
       
       hondaCar.seat();
       hondaCar.cold();
       hondaCar.refresh();
       hondaCar.power();
       hondaCar.speed();
       hondaCar.eco();
  
       System.out.println(Gas.price);//1
       System.out.println(Engine.price);//3
       System.out.println(AirCondition.price);//2    (2) // we have more than 1 ssame name variable so we used iterface+variable
     //  System.out.println(Gas.price);
	}
	
	public void seat() {  // we should write public if we not it is default
		//but in interface it is all public
		System.out.println("Leather seats");
	}

	@Override
	public void cold() {
		System.out.println("Colds well");		
	}

	@Override
	public void refresh() {
		System.out.println("Refreshs well");		
		}

	@Override
	public void speed() {
		System.out.println("Very speed car");		
	}

	@Override
	public void power() {
		System.out.println("It has 215 horse-power");	
	}

	@Override
	public void eco() {
		System.out.println("It is an eco car");
		
	}
}
