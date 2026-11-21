package com.kodewala.oops.inheritance;

public class NewAccount {
	double balance;
	//constructor

	public NewAccount(double balance) {
		super();
		this.balance = balance;
	}
	//Method to show the balance
	public void showBalance() {
		System.out.println("Account Balance: " +balance);
	}

}
