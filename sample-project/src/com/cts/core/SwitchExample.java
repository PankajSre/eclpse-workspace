package com.cts.core;

import java.util.Date;
import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		
		Date date = new Date();
	
		
		int days = date.getDay();

		switch (days) {
		
		case 0:
			System.out.println("Sunday");
			break;
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		default:
			System.out.println("Enter a Number between 0-6");

		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		
		}
	}

}
