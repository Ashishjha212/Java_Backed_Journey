package com.kodewala.MarkerInterface;

public class Driver {

	public static void main(String[] args) {
		User user = new User("Ashish", "Aj654");
		DataCleaner cleaner = new DataCleaner();
		//Cleaning the User Object
		cleaner.clean(user);

	}

}
