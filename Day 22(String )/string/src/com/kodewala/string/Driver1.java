package com.kodewala.string;

class User {
	String city;

	User(String _city) {
		this.city = _city;

	}
}

public class Driver1 {

	public static void main(String[] args) {
		String city1 = "Bangalore";
		String city2 = "Bangalore";
		String city3 = "Bangalore";
		System.out.println(city1.equals(city2));

		User user1 = new User("Mumbai");
		User user2 = new User("Mumbai");
		System.out.println(user1.equals(user2));

	}

}
