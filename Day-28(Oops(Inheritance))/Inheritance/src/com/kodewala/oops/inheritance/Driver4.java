package com.kodewala.oops.inheritance;

public class Driver4 {

	public static void main(String[] args) {
		SavingsAccount savingsAccount = new SavingsAccount(12345, 10000.0, 5.0);
		savingsAccount.deposit(2000.0);
		savingsAccount.calculateInterestRate();
		savingsAccount.displayInterest();
		
		
		
		
	}

}
