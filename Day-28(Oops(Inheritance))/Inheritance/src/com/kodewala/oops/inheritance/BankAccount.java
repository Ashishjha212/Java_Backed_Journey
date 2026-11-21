package com.kodewala.oops.inheritance;

public class BankAccount {
	long accountNumber;
	double balance;
	
	public BankAccount(long accountNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance= balance;
	}
	public void deposit(double amount) {
		 balance= balance+amount;
		 System.out.println("Amount deposit " +amount);
	    
	}
	public void displayBalance() {
		System.out.println("Account number " +accountNumber);
		
	}

}
