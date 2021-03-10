package com.cts.core.collection;

import java.util.Comparator;

public class User // implements Comparable<User>
{
	private int id;
	private String username;
	private String password;
	private String address;
	private int age;
	private long phoneNumber;

	public User() {
	}

	public User(int id, String username, String password, String address, int age, long phoneNumber) {

		this.id = id;
		this.username = username;
		this.password = password;
		this.address = address;
		this.age = age;
		this.phoneNumber = phoneNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", address=" + address
				+ ", age=" + age + ", phoneNumber=" + phoneNumber + "]";
	}

//	@Override
//	public int compareTo(User user) {
//		// sort according to id
//
//		if (this.id > user.id) {
//			return -1;
//		} else if (this.id < user.id) {
//			return 1;
//		}
//
//		else {
//			return 0;
//		}
//
//	}

//	@Override
//	public int compareTo(User user) {
//		// sort according to id
//
//		if (this.age > user.age) {
//			return 1;
//		} else if (this.age < user.age) {
//			return -1;
//		}
//
//		else {
//			return 0;
//		}
//
//	}

}

class SortById implements Comparator<User> {

	@Override
	public int compare(User user1, User user2) {

		if (user1.getId() > user2.getId()) {
			return 1;
		} else if (user1.getId() < user2.getId()) {
			return -1;
		}

		else {
			return 0;
		}

	}

}

class SortByName implements Comparator<User> {

	@Override
	public int compare(User user1, User user2) {

		return user1.getUsername().compareTo(user2.getUsername());
	}

}
