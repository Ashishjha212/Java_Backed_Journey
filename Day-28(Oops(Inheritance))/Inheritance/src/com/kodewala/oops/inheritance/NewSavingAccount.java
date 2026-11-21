package com.kodewala.oops.inheritance;

public class NewSavingAccount extends NewAccount {
	double interestRate;
	//constructor
	public NewSavingAccount(double balance, double interestRate) {
		super(balance);// calling parent class constructor
		this.interestRate = interestRate;
	}
	
	//Method to calculate interest
	public void calculateInterest() {
		double interest = balance*interestRate/100;
		System.out.println("Interest Earned :"+interest);
	}

}
