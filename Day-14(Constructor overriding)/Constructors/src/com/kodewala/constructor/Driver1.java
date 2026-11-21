package com.kodewala.constructor;

public class Driver1 {

	public static void main(String[] args) {
		NotificationService n = new NotificationService();
		n.sendNotification("sms");
		n.sendNotification("");

	}

}
