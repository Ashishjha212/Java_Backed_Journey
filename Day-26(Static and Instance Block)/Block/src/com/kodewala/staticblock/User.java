package com.kodewala.staticblock;

public class User {
	String userName;
	String userId;
	String mobileNumber;

	// static block will get executed just after the class Loading

	static {
		System.out.println("I am in static init block 1");
	}
	static {
		System.out.println("I am in static init block 2");
	}

	static {
		System.out.println("I am in static init1 block 3");
	}


	public User(String userName, String userId, String mobileNumber) 
	{
		//either super or this
		System.out.println("User.User() (String userName, String userId, String mobileNumber)  constructor");
	
		this.userName = userName;
		this.userId = userId;
		this.mobileNumber = mobileNumber;
	}

	
}
