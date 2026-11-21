package com.kodewala.oops.inheritance;

public class CurrentAccount extends BankAccount{
	double overdraftLimit;

	public CurrentAccount(long accountNumber, double balance, double overdraftLimit) {
		super(accountNumber, balance);
		this.overdraftLimit = overdraftLimit;
	}
	public void displayOverdraftLimit() {
		System.out.println(accountNumber);
		System.out.println(balance);
		System.out.println(overdraftLimit);
	}

}
