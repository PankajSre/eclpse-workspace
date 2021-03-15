package com.cts.core.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class FilterDemo {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		
		Stream<Integer> s = list.stream();
//		Stream<Integer> even = s.filter(i -> i%2 ==0);
//		even.forEach(System.out::println);
		
		Stream<Integer> map = s.map(i -> i*2);
		map.forEach(System.out::println);
		

	}

}
