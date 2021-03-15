package com.cts.core.thread;

public class ThreadDemo {

	public static void main(String[] args) {
		
		Thread thread = Thread.currentThread();
        thread.setName("My Thread");
		System.out.println(thread.getName());
		System.out.println(thread.getPriority());
		System.out.println("The Tread Alive ? : "+ thread.isAlive());
		System.out.println("is thread Daemon ? : "+ thread.isDaemon());
		
	}

}
