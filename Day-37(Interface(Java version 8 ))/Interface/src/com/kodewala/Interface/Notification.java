package com.kodewala.Interface;

public interface Notification {
	public default void send() {
		System.out.println("Notification.send()");
	}

}
