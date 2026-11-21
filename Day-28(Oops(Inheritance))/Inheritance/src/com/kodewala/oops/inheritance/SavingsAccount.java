package com.kodewala.oops.inheritance;

public class SavingsAccount extends BankAccount {
	double interestRate;

	public SavingsAccount(long accountNumber, double balance, double interestRate) {
		super(accountNumber, balance);
		this.interestRate = interestRate;
	}

	public void calculateInterestRate() {
		interestRate = balance * interestRate / 100;
	}

	public void displayInterest() {
		System.out.println("Account number " +accountNumber);
		System.out.println("Current Balance " +balance);
		System.out.println("Interest "+interestRate);
	}

}
