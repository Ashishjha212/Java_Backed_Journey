package com.kodewala.abstraction1;

public class BankSystem {

	public static void main(String[] args) {
		Account saving = new SavingAccount(20000.0, 5.0);
		saving.showBalance();
		saving.calculateInterest();
		saving.showBalance();
		System.out.println(".........................................");
		Account current = new CurrentAccount(2000.0);
		current.showBalance();
		current.calculateInterest();
		current.showBalance();

	}

}
