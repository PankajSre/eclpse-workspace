package com.cts.core.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListFacts {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		List<String> l = Collections.synchronizedList(list);
	}

}
