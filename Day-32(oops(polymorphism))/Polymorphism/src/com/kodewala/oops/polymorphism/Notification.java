package com.kodewala.oops.polymorphism;

public class Notification {
	void send() {
		System.out.println("Parent class Message");
	}

}

class EmailNotification extends Notification {
	@Override
	void send() {
		System.out.println("Email is send");
	}
}

class SMSNotification extends Notification {
	@Override
	void send() {
		System.out.println("Sms is send");
	}
}
