package com.cts.core.exception;

public class CustomException {

	public static void checkAge(int age) throws AgeLimit {
		if (age < 20) {
			throw new AgeLimit();

		} else {
			System.out.println("Your Age is fine");
		}
	}

	public static void main(String[] args) {
		try {
			checkAge(18);
		} catch (AgeLimit obj) {

			System.out.println(obj.getMessage());
		}
	}

}

class AgeLimit extends Exception {

	public AgeLimit() {
		super();
	}

	public AgeLimit(String message) {
		System.out.println("The Exception Message is : " + message);
	}

	public String getMessage() {
		return "Check Age";
	}

}
