package com.cts.core.collection;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		addElements(list);
		
		Collections.sort(list);
		for(Integer obj : list) {
			
			Integer value = obj;
			System.out.println(value);
		}
		
		
	}

	private static void addElements(LinkedList<Integer> list) {
		list.add(100);
		list.add(150);
		list.add(120);
		list.add(75);
		list.add(200);
		list.add(100);
		list.add(110);
		
		
	}

}
