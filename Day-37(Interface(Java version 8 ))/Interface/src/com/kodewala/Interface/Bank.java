package com.kodewala.Interface;

public interface Bank {
	public abstract double getInterestRate();

	public default void displayMessage() {
		System.out.println("Welcome to the bank");
	}

}
