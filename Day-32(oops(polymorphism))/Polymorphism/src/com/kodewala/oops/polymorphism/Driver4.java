package com.kodewala.oops.polymorphism;

public class Driver4 {

	public static void main(String[] args) {
		Notification notification;
		notification=new EmailNotification();
		notification.send();
		notification=new SMSNotification();
		notification.send();

	}

}
