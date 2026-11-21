package com.kodewala.Interface;

public interface Vehicle {
	public default void start() {
		System.out.println("Vehicle is starting");
	}

}
