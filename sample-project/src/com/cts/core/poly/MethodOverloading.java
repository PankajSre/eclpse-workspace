package com.cts.core.poly;

public class MethodOverloading {

	public static void main(String[] args) {
       Area ar = new Area();
       double  circle = ar.area(20.5F);
       
       System.out.println(circle);
       
       double ar1 = ar.area(12,12.0);
       
       System.out.println("Rectangle :"+ ar1);
       double ar2 = ar.area(12.5, 10);
       // Compile Time Error
//       double ar3 = ar.area(12,12);
       
	}

}

class Area {
	public static final double PI = 3.14;

	// Area of Square
	public int area(int a) {
		return a * a;
	}

	// Area of Circle
	public double area(double radius) {
		return PI * radius * radius;
	}

	// Rectangle
	public double area(int l, double b) {
		return l * b;
	}

	// area of triangle
	public double area(double h, int b) {
		return h * b / 2;
	}
}
