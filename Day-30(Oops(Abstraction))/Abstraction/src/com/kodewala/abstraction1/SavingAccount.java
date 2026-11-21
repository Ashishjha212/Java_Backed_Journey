package com.kodewala.abstraction1;

public class SavingAccount extends Account {
	double interestRate = 5.0;

	public SavingAccount(double balance, double interestRate) {
		super(balance);
		this.interestRate = interestRate;
	}

	@Override
	void calculateInterest() {
		double interest = (balance * interestRate) / 100;
		balance = balance + interest;
		System.out.println("Interest added: " + interest);
	}

}

class CurrentAccount extends Account {

	public CurrentAccount(double balance) {
		super(balance);
	}

	@Override
	void calculateInterest() {
		System.out.println("No Interest for Current Account. ");
	}
}
