package com.cts.core;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Your name : ");
		String name = in.nextLine();
		
		System.out.println("Welcome : "+ name);
	}

}
