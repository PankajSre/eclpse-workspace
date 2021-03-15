package com.cts.core.thread;

class Resource {
	public void display(String name) {
		synchronized (this) {
			for (int i = 1; i <= 5; i++) {
				System.out.println("Count - " + i + " : " + name);
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

	}
}

public class ThreadSynchronization {

	public static void main(String[] args) {

		Resource resource = new Resource();
		ThreadOne one = new ThreadOne(resource);
		ThreadTwo two = new ThreadTwo(resource);
		one.start();
		two.start();

	}

}

class ThreadOne extends Thread {
	Resource resource;

	public ThreadOne(Resource resource) {
		this.resource = resource;
	}

	public void run() {
		resource.display("ThreadOne");
	}
}

class ThreadTwo extends Thread {
	Resource resource;

	public ThreadTwo(Resource resource) {
		this.resource = resource;
	}

	public void run() {
		resource.display("ThreadTwo");
	}
}
