package com.cts.core.java8;

public class ThreadDemo {

	public static void main(String[] args) {
		
		Runnable runnable = () -> System.out.println("Hello");
		
		Thread t = new Thread(runnable);
		t.start();
	}

}
