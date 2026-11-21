package com.kodewala.abstraction1;

abstract class Account {
	double balance;

	public Account(double balance) {
		super();
		this.balance = balance;
	}

	abstract void calculateInterest();

	void showBalance() {
		System.out.println("Current Balance: "+balance);
	}

}
