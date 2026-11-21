package com.kodewala.oops.polymorphism;

class User {

}

class AdminUser extends User {  //AdminUser IS-A type of User

}

class FinanceUser extends User {

}

public class Driver {
	public static void main(String[] args) {
		User user = new AdminUser(); //auto up-Casting
		AdminUser adminUser =(AdminUser) new User(); //Down-casting
		User u1 = new FinanceUser();
		Object obj = new FinanceUser();


	}

}
