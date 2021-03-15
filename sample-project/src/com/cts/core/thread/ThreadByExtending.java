package com.cts.core.thread;

public class ThreadByExtending {

	public static void main(String[] args) {
		// I have Only 1 Thread --main
		 Thread.currentThread().setPriority(8);
		OddThread thread = new OddThread();
		EvenThread evenThread = new EvenThread();
		
		Thread odd = new Thread(thread, "My Odd Thread");
		Thread even = new Thread(evenThread, "My Even Thread");
         even.setPriority(6);
         odd.setPriority(3);
         
		System.out.println("Main Thread priority: "+ Thread.currentThread().getPriority());
		System.out.println("Odd Thread Priority: "+ odd.getPriority());
	
		System.out.println("Even Thread Priority: "+ even.getPriority());
		odd.start();
		even.start();

	
	}

}

//class OddThread extends Thread {
//	// this will be executed by child thread!
//	public void run() {
//		for (int i = 1; i <= 10; i++) {
//			if (i % 2 != 0)
//				System.out.println("Odd Thread : " + i);
//			try {
//				Thread.sleep(3000);
//			} catch (InterruptedException e) {
//
//				e.printStackTrace();
//			}
//		}
//
//	}
//}

class OddThread implements Runnable {
	// this will be executed by child thread!
	public void run() {
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0)
				System.out.println("Odd Thread : " + i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}

	}
}

//class EvenThread extends Thread {
//	public void run() {
//		for (int i = 1; i <= 10; i++) {
//			if (i % 2 == 0)
//				System.out.println("Even Thread : " + i);
//			try {
//				Thread.sleep(3000);
//			} catch (InterruptedException e) {
//
//				e.printStackTrace();
//			}
//		}
//
//	}
//
//}


class EvenThread implements Runnable {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0)
				System.out.println("Even Thread : " + i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}

	}

}
