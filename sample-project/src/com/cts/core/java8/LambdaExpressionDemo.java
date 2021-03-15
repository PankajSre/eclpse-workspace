package com.cts.core.java8;

public class LambdaExpressionDemo {

	public static void main(String[] args) {
	// Lambda Expression
		Calculate cal = a ->  a*a;
		
		System.out.println(cal.area(5));
		
	}

}
@FunctionalInterface
interface Calculate {
	public int area(int a);
	
	default void display() {
		System.out.println("Hello");
	}
	
	static int sub(int a, int b) {
		return a-b;
	}
}



