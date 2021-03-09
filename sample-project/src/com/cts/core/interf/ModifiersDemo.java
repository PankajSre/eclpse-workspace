package com.cts.core.interf;

import com.cts.core.modifiers.Test;

public class ModifiersDemo extends Test {

	public static void main(String[] args) {
		Test test = new Test();
		ModifiersDemo demo = new ModifiersDemo();
		System.out.println(test.shape);
		System.out.println(demo.breadth);
	}

}
