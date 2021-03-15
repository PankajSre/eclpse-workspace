package com.cts.core.java8;

public class AnonymousInnerDemo {

	public static void main(String[] args) {
     // Anonymous inner class
		Test t = new Test() {
			public int add(int a, int b) {
				return a + b;
			};
		};
		int sum = t.add(2, 3);
		System.out.println(sum);
	}

}

abstract class Test {
	public abstract int add(int a, int b);
}
