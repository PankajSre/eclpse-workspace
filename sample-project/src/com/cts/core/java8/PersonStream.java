package com.cts.core.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PersonStream {

	public static void main(String[] args) {

		List<Person> persons = new ArrayList<Person>();
		addPersons(persons);

		// List of persons with salary > 80000
		List<Person> salaryScale = persons.stream().filter(s -> s.getSalary() > 80000 && s.getAge()<30).collect(Collectors.toList());
		System.out.println("Persons with Salary Less than 80000 : \n");
		for (Person p : salaryScale) {
			System.out.println(p);
		}
		
		//Age Greater than 30
//		List<Person> ageScale = persons.stream().filter(s -> s.getAge()>30).collect(Collectors.toList());
//		System.out.println("Persons with Age greater than 30 : \n");
//		ageScale.forEach(System.out::println);
		
		//Persons Which name has lenght more than 6
		
//		List<Person> lenghtScale = persons.stream().filter(s -> s.getName().length() > 6).collect(Collectors.toList());
//		System.out.println("Persons Which name Lenght is greater than 6 : \n");
//		lenghtScale.forEach(System.out::println);
		
		//List Of Persons With Capital names
		List<String> capNames = persons.stream().map(s -> s.getName().toUpperCase()).collect(Collectors.toList());
		System.out.println("List of Names : \n");
		capNames.forEach(System.out::println);

	}

	private static void addPersons(List<Person> persons) {
		persons.add(new Person(101, "Pankaj", 56767, 34));
		persons.add(new Person(123, "Advik", 23442, 5));
		persons.add(new Person(111, "Krishna", 989898, 11));
		persons.add(new Person(110, "Adamya", 123456, 1));
		persons.add(new Person(109, "Sucheta", 56756, 32));
		persons.add(new Person(115, "Bharat", 45000, 22));

		
	}

}

class Person {
	private int id;
	private String name;
	private double salary;
	private int age;

	Person() {
	}

	public Person(int id, String name, double salary, int age) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.age = age;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		return id + " : " + name + " : " + salary + " : " + age;
	}
}
