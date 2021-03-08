package com.cts.core;

public class AbstractDemo {

	public static void main(String[] args) {
//		Vehicles vehicles = new Vehicles();
			
		
//		Bike bike = new Bike();
//		bike.wheelCount();
	}

}
// It is not 100% abstract
abstract class Vehicles {
	
	public Vehicles() {
		
	}
	// method Declaration
	public abstract void wheelCount() ;
	
	
}

class CarA extends Vehicles {
	//definition
	public void wheelCount() {
		System.out.println("4 Wheels");
	}
}
//class Auto extends Vehicles{}
//class Bike extends Vehicles{}
