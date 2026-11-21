package com.kodewala.Interface;

public class Driver1 {

	public static void main(String[] args) {
		BankAccount account = new SavingAccount(200.0);
		double result = account.deposit(1000);
		//System.out.println(result);
		double withdraw1 = account.withdraw(200);

	}

}
