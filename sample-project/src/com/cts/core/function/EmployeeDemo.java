package com.cts.core.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class EmployeeDemo {

	public static void main(String[] args) {

		ArrayList<Employee> employees = new ArrayList<Employee>();
		addEmployee(employees);

		// System.out.println(employees);
		//Agerage Salary
		Function<List<Employee>, Double> f = emp -> {
			double sum = 0;
			for (Employee e : emp) {
				sum = sum + e.salary;
			}
			return sum / emp.size();
		};
		
		System.out.println(f.apply(employees));

	}

	private static void addEmployee(ArrayList<Employee> employees) {
		employees.add(new Employee("Pankaj", 45000, 34));
		employees.add(new Employee("Raju", 42000, 25));
		employees.add(new Employee("Ravi", 35000, 29));
		employees.add(new Employee("Advik", 76000, 5));
		employees.add(new Employee("Adamya", 87600, 1));

	}

}

class Employee {

	String name;
	double salary;
	int age;

	public Employee(String name, double salary, int age) {
		super();
		this.name = name;
		this.salary = salary;
		this.age = age;
	}

	public String toString() {
		return name + " : " + salary + " : " + age;
	}

}