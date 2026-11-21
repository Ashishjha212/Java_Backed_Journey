package com.kodewala.oops.inheritance;

public class Driver3 {

	public static void main(String[] args) {
		Developer developer = new Developer("Ashish", 101, 100000.500, "Java");
		developer.writeCode();
		NewManager manager = new NewManager("Abhinav", 105, 80000.78, 10);
		manager.conductMeeting();

	}

}
