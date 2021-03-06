package com.cts.core;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
//		int[] marks = {45,67,87,23,90,11,72};
		
//		int[] marks = new int[3];
//		marks[0] = 70;
//		marks[1]= 80;
//		marks[2]= 60;
		int[] marks = new int[10];
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 10 Numbers : ");
		
		String[] names = new String[10];
		
		for(int i=0;i<10; i++) {
			marks[i] = in.nextInt();
		}
		
		for(Object m : marks) {
			System.out.print(m+" ");
		}
	}

}
