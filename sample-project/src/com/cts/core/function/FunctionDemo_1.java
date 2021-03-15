package com.cts.core.function;

import java.util.function.Function;

public class FunctionDemo_1 {

	public static void main(String[] args) {
		
		Function<Integer, Integer> function = i -> i*i;
		
		System.out.println(function.apply(11));
		
		System.out.println(function.apply(12));

	}

}

