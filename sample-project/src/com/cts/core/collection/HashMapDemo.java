package com.cts.core.collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class HashMapDemo {

	public static void main(String[] args) {
		
		Hashtable<String, Integer> map = new Hashtable<String, Integer>();
		map.put("Apple", 200);
		map.put("Banana", 50);
		map.put("Orange", 75);
		map.put("Mango", 60);
		map.put("Guava", 60);
		map.put("Apple", 300);
//		map.put(null, 200);
		
		for(Entry<String, Integer> entry : map.entrySet()) {
			
			System.out.println(entry.getKey()+ " --> "+entry.getValue());
		}
		
		
		
		
		
	}

}
