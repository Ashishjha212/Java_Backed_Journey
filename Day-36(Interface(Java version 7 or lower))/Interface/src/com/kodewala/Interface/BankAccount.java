package com.kodewala.Interface;

public interface BankAccount {
	public static final double MIN_BALANCE = 1000;

	// Abstract Method
	public abstract double deposit(double amount);
	public abstract double withdraw(double amount);
	public abstract double checkBalance();
	

}
