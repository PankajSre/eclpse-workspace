package com.cts.core;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(25);
		System.out.println(sb.capacity());//16
		
		sb.append("This is advanced Java batch");
		System.out.println(sb.capacity());//34
		
		sb.insert(1, "TEST");
		sb.replace(2, 7, "Hello");
		sb.delete(12, 18);
		sb.reverse();
		
	}

}
