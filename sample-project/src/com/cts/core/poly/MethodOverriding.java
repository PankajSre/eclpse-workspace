package com.cts.core.poly;

public class MethodOverriding {

	public static void main(String[] args) {

		Vehicle vehicle = new Vehicle();
		vehicle.display(); // This is vehicle class
		
		Bike bike  = new Bike();
		bike.display(); // This is Bike Class
		
		Vehicle v = new Bike(); // late Binding, Dynamic binding
		v.display();
		
		//Bike b = new Vehicle(); X
	}

}

class Vehicle {

	public int wheelCount() {
		return 4;
	}

	public void display() {
		System.out.println("This is Vehicle Class!");
	}
}

class Bike extends Vehicle {
	@Override
	public int wheelCount() {
		return 2;
	}

	@Override
	public void display() {
		System.out.println("This is Bike Class!");
	}
}
