package com.kodewala.Interface;

public interface Payment {
	default void pay() {
		System.out.println("Interface payment");
	}

}
