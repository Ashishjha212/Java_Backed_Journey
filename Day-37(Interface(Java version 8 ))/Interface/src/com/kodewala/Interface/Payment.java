package com.kodewala.Interface;

public interface Payment {
	public default void pay() {
		System.out.println("Payment processing");
	}

}
