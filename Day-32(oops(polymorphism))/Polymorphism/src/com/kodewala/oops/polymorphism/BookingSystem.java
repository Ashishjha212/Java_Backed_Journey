package com.kodewala.oops.polymorphism;

public class BookingSystem {
	void bookTicket(String name) {
		System.out.println("Passenger Name is:" + name);
	}
	void bookTicket(String name,String email) {
		System.out.println("Passenger Name is:" + name + " email is: " +email);
	}
	void bookTicket(String name,long phoneNumber) {
		System.out.println("Passenger Name is:" + name + " phoneNumber is: " +phoneNumber);
	}
	

}
