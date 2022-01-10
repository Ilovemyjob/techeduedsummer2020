package day36interfacesiteratorsdt;

public class Accounting implements Employee{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Differences between Abstract Class and Interface
 1) Method Differences:
    ==> Abstract classes can have both abstract and concrete methods but
        interfaces normally can have just abstract methods.
        After Java 8, we can use "default" and "static" keywords to create
        concrete methods in an interface
 2) Variable Differences:
    ==> Abstract classes can have final or non-final, static or non-static variables.
     But interfaces can have just final(must be initialized) and just static varibles.
    ==> Abstract classes can have public, protected, default, private variables 
    but interfaces can have just public variables.
 3) Inheritance Differences:
    ==> We use "extends" keyword to inherit from a class(abstract or not) to a class(abstract or not).
    We use "implements" keyword to inherit from a  class(abstract or not) to interface.
    We use "extends" keyword to inherit from an interface to an interface.
    An interface cannot accept a class as parent
    ==> We cannot create multiple inheritance between classes but multiple inheritance is 
    supported by Java when we use interfaces
 */
		
	}

	@Override
	public double salary(String department) {
		// TODO Auto-generated method stub
		double task = 5000;
		double education=500;
		double kids= 200;
		double rate=80000;
	double salary=task+education+kids+rate;
   return salary;
	}

	@Override
	public void task() {
		// TODO Auto-generated method stub
		System.out.println("automation tester");
	}

	@Override
	public void personalInfo() {
		System.out.println("2 kids,master");
	
		// TODO Auto-generated method stub
		
	}

}
