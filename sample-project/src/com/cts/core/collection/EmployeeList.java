package com.cts.core.collection;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeList {

	public static void main(String[] args) {

		ArrayList<Employee> employees = new ArrayList<Employee>();

		employees.add(new Employee(1003, "Harsha", 7654321234L));
		employees.add(new Employee(1002, "Krishna", 9876789098L));
		employees.add(new Employee(1001, "Suresh", 1234123412L));
		employees.add(new Employee(1006, "Charan", 2351678909L));
		employees.add(new Employee(1005, "Mahesh", 6543123456L));

		System.out.println("-------Before  Sorting------");
		for (Employee employee : employees) {

			System.out.println(employee);
		}

//		Collections.sort(employees);
		SortPhone sortPhone = new SortPhone();
		Collections.sort(employees, new SortName());
		System.out.println("-------After  Sorting------");
		for (Employee employee : employees) {

			System.out.println(employee);
		}

	}

}
