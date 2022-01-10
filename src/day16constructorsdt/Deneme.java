package day16constructorsdt;

import java.util.Iterator;

public class Deneme {

	int price = 20000;
	int year = 2015;
	String make = "Honda";
	String type = "Civic";
	
	Deneme(){
//		this.price= price;
//		this.make = make;
	}
	
	Deneme(int price,int year){
		
	}
	
    Deneme(int price,int year,String make,String type){
    	this.price= price;
		this.make = make;
	}
	
	
	//to make update easly
    //for each car we create one obj
	
	
	public static void main(String[] args) {
		
		Deneme obj = new Deneme();
		
		System.out.println(obj.make);
		System.out.println(obj.price);
		int price = 1000;
		System.out.println(obj.price);
		System.out.println(price);
		obj.price = 2000;
		System.out.println(obj.price);
	//by help of default constructor we can print print all data 
		//
		System.out.println("===");
		obj.price = 3000;
		System.out.println(obj.price);
		obj.year = 2018;
		System.out.println(obj.year);
		obj.type="vato";
		System.out.println(obj.type);
		
		// by default value we can add value with or without "this"
		//but long way
		// to make short we need cont. with parameter
		//but we can check just this parameter
		//prarameter must be same
		Deneme obj2 = new Deneme(5000,2005);
		System.out.println("====");
		
		
		System.out.println(obj2.price);
		System.out.println(obj2.year);
		System.out.println(obj2.make);
		System.out.println(obj2.type);
		
		System.out.println("=====");
		obj2.make = "toyota";
		obj2.price=12000;
		obj2.year=2030;
		obj2.type="mars";
		System.out.println(obj2.make);
		System.out.println(obj2.price);
		System.out.println(obj2.year);
		System.out.println(obj2.type);
		
		//after this we can change it
		
		System.out.println("======");
		//if we not write "this" it is doesnt change value
		//we get just value was it is written 
		System.out.println("=====");
		Deneme obj3 = new Deneme(5000,2020,"Ferrari","red");
		
		System.out.println(obj3.price);
		System.out.println(obj3.year);
		System.out.println(obj3.make);
		System.out.println(obj3.type);

	// if we have this then it change otherwise doesnot change
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
