package com.cts.core.collection;

import java.util.Comparator;

public class Employee // implements Comparable<Employee>
{

	private int id;
	private String name;
	private long phoneNumber;

	public Employee() {
	}

	public Employee(int id, String name, long phoneNumber) {
		super();
		this.id = id;
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", phoneNumber=" + phoneNumber + "]";
	}

//	@Override
//	public int compareTo(Employee employee) {
//		if (this.phoneNumber > employee.phoneNumber) {
//			return 1;
//		} else if (this.phoneNumber < employee.phoneNumber) {
//			return -1;
//		} else {
//			return 0;
//		}
//
//	}

}

class SortPhone implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {
		if (emp1.getPhoneNumber() > emp2.getPhoneNumber()) {
			return 1;
		} else if (emp1.getPhoneNumber() < emp2.getPhoneNumber()) {
			return -1;
		}
		return 0;
	}

}

class SortName implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {

		return o1.getName().compareTo(o2.getName());
	}

}
