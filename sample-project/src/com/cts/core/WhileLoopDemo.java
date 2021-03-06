package com.cts.core;

import java.util.Scanner;

//  WAP to find the sum of the digits of a given number  ex  123 = 6, 11111= 5, 11=2
public class WhileLoopDemo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = in.nextInt();
        int sum = getSum(num);
		System.out.println("The Sum is : " + sum);

	}

	public static int getSum(int num) {

		int sum = 0;
		do {
			sum = sum + num % 10;
			num = num / 10;
		}while (num > 0);
		return sum;

	}

}
