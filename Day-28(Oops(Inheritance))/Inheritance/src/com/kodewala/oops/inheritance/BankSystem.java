package com.kodewala.oops.inheritance;

public class BankSystem {

	public static void main(String[] args) {
		NewSavingAccount savingAccount = new NewSavingAccount(20000.876, 5.75);
		savingAccount.showBalance();
		savingAccount.calculateInterest();

	}

}
