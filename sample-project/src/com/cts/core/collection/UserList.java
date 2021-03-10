package com.cts.core.collection;

import java.util.ArrayList;
import java.util.Collections;

public class UserList {

	public static void main(String[] args) {

		ArrayList<User> users = new ArrayList<User>();

		addUsers(users);
		//Collections.sort(users);
		
//		Collections.sort(users, new SortById());
		Collections.sort(users, new SortByName());
		for (User user : users) {
			System.out.println(user);
		}

	}

	private static void addUsers(ArrayList<User> users) {

//		User user1 = new User(201, "admin", "admin@123", "Bangalore", 22, 6786876870L);
//		User user2 = new User(101, "user", "user@123", "Delhi", 20, 1234567890l);
//		User user3 = new User(109, "bharat", "12345", "Chennai", 21, 8765432167L);
//		User user4 = new User(301, "Mohan", "m1234", "Hydrabad", 24, 1876524232L);
//		User user5 = new User(203, "Paritosh", "p#123", "Mumbai", 19, 9876589765L);

		users.add(new User(201, "Admin", "admin@123", "Bangalore", 22, 6786876870L));
		users.add(new User(101, "User", "user@123", "Delhi", 20, 1234567890l));
		users.add(new User(109, "Bharat", "12345", "Chennai", 21, 8765432167L));
		users.add(new User(301, "Mohan", "m1234", "Hydrabad", 24, 1876524232L));
		users.add(new User(203, "Paritosh", "p#123", "Mumbai", 19, 9876589765L));

	}

}
