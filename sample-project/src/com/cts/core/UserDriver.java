package com.cts.core;

import java.util.HashSet;

public class UserDriver {

	public static void main(String[] args) {
		User user1 = new User();
		User user2 = new User();
		
		user1.setId(201);
		user1.setName("Rohit");
		user2.setId(201);
		user2.setName("Rohit");
		
		System.out.println(user1.equals(user2));
		
		HashSet<User> users = new HashSet<User>();
		users.add(user1);
		users.add(user2);
		
		System.out.println(users);
		
	}

}
