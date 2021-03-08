package com.cts.core;

public class StaticDemo {
	// Instance variables

	public static void main(String[] args) {

		Calculator cal1 = new Calculator();
		Calculator cal2 = new Calculator();
		Calculator cal3 = new Calculator();
		
		System.out.println(cal1.age); //10
		System.out.println(cal2.height);//20
		System.out.println(cal3.age); //10
		
		cal1.age = 30;
		cal3.height = 50;
		
		
		System.out.println(cal2.age); // 10
		System.out.println(cal2.height); //50
		System.out.println(cal3.age); // 10
		System.out.println(cal3.height); //50
//		int sub = Calculator.sub(12, 10);
//		int sum = cal1.add(12, 10);
//		System.out.println("Subtraction: "+sub);
//		System.out.println("Addition: "+sum);
//		System.out.println("Height : "+ Calculator.height);
	}

}

class Calculator {
	int age = 10;
	static int height = 20;

	public int add(int num1, int num2) {

		return num1 + num2;
	}

	public static int sub(int num1, int num2) {
		return num1 - num2;
	}
	
	public static void display() {
		System.out.println(height);
	}

}
