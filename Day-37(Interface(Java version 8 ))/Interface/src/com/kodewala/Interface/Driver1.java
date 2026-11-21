package com.kodewala.Interface;

public class Driver1 {

	public static void main(String[] args) {
		EmailNotification emailNotification  = new EmailNotification();
		emailNotification.send();
		
		SmsNotification smsNotification = new SmsNotification();
		smsNotification.send();

	}

}
