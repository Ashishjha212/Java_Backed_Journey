package com.kodewala.oops.polymorphism;

public class Driver3 {

	public static void main(String[] args) {
		BookingSystem bookingSystem =  new BookingSystem();
		bookingSystem.bookTicket("Ashish");
		bookingSystem.bookTicket("Ashish", 89765678);
		bookingSystem.bookTicket("Abhinav", "Ab7865@gmail.com");
	}

}
