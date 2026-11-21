package com.kodewala.constructors2;

public class Driver1 {

	public static void main(String[] args) {
		NotificationService notificationService = new NotificationService();
		notificationService.sendNotification("other");
		notificationService.sendNotification("sms");
		notificationService.sendNotification("email");
		
		

	}

} 
