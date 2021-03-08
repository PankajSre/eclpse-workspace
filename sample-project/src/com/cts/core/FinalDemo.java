package com.cts.core;

public class FinalDemo {

	public static void main(String[] args) {
	 Vehicle vehicle = new Vehicle(10);
	 System.out.println(vehicle.AGE);
	 
	}

}

 class Vehicle {
	 final int AGE;
//	 age = 30;
	 
	 public Vehicle() {
		AGE = 30;
	}
	 public Vehicle(int a) {
		AGE = 40; 
	 }
	 public void display() {
		System.out.println("Vehicle Class");
	}
}

class Car  extends Vehicle{
	
	public void display() {
		System.out.println("Car class");
	}
}
