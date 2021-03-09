package com.cts.core.encapsulation;

public class EmployeeDriver {

	public static void main(String[] args) {
		Employee employee = new Employee();
		
		System.out.println(employee.getId());
		employee.setId(20);
		System.out.println(employee.getId());
	}

}
