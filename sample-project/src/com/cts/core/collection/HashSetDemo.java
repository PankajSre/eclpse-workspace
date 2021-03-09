package com.cts.core.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetDemo {

	public static void main(String[] args) {
		TreeSet<String> names = new TreeSet<String>();
		addNames(names);
		
		System.out.println(names);
	}

	private static void addNames(TreeSet<String> names) {
		names.add("Pawan");
		names.add("Arvind");
		names.add("Bharat");
		names.add("Bharat");
		names.add("Bharat");
		names.add("Bharat");
		names.add("Akhilesh");
	}

}
