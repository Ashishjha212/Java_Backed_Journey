package com.kodewala.constructor1;

public class SuperUser extends Object {
	SuperUser(int a){
		super(); // calling super class no args constructor
		//execute remaining steps if any
	}

}

class User extends SuperUser  {
	String userName;
	String userId;
	String mobile;

	User(String _userName, String _userId, String _mobile) {
		super(700); // first line of constructor is either super or this.Even if you are not writing super or this
		//then compiler will consider super() with no args.
		this.userName = _userName;
		this.userId = _userId;
		this.mobile = _mobile;

	}

}
