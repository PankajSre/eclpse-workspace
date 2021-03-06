package com.cts.core;

import java.util.*;

public class NestedIfElse {
	public static void main(String[] args) {
		int size;
		String color;
		Scanner sc = new Scanner(System.in);
		color = sc.nextLine();
		if (color.equalsIgnoreCase("CRT")) {
			System.out.println("Discount Rate:5");
		} else {
			size = sc.nextInt();
			if (size == 14)
				System.out.println("Discount Rate:8");
			else
				System.out.println("Discount Rate:10");

		}
	}
}
