package com.cts.core.interf;

interface Person {
	void display();

	int add(int a, int b);
	
	default void sleep() {
		System.out.println("Sleep Everyday!!!");
	}
	
	static String behaviour() {
		return "A person behaviour changes as per the situation";
	}
}

interface Book  extends Person{
	void read();

	int pageCount();
}

class Device {
	public int deviceCount() {
		return 20;
	}
	public void show() {
		System.out.println("I have Laptop, Mobile and Smart Watch");
	}
}
class Manager extends Device implements Book {
	@Override
	public void display() {
		System.out.println("This is manager class");
	}

	@Override
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public void read() {
		System.out.println("Read daily 2 Hrs");
	}

	@Override
	public int pageCount() {

		return 250;
	}
}

public class Hello {

	public static void main(String[] args) {

		Manager manager = new Manager();
		manager.display();
		
		Person.behaviour();

	}
}