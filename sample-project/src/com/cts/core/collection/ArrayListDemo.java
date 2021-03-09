package com.cts.core.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
//		List list = new ArrayList();
		ArrayList list = new ArrayList(); // 10 size
		list.add("Hello");
		list.add(2021);
		list.add(true);
		list.add(20.20);
		list.add(12.23f);

//		System.out.println("Size : "+list.size());
//		System.out.println("Contains (Java)? :"+list.contains("Java"));

//		for (Object obj : list) {
//			System.out.println(obj);
//		}

//		list.forEach(System.out::println);

		ListIterator itr = list.listIterator();
      System.out.println("-----------Forward Direction---------");
		while (itr.hasNext()) {
			Object obj = itr.next();
			System.out.println(obj);
		}
		
		 System.out.println("-----------Backward Direction---------");
			while (itr.hasPrevious()) {
				Object obj = itr.previous();
				System.out.println(obj);
			}

	}

}
