package com.kodewala.oops.overriding;

public class Account {
	int minBalance = 10000;
	public void openAccount(String name, int bal) {
		System.out.println("Account.OpenAccount()......");
		
	}
	public static void currentAccount() {
		System.out.println("currentAccount parent");
	}

}
class SavingAccount extends Account{
	@Override
	public void openAccount(String name, int bal) {
		System.out.println("SavingAccount.openAccount().......");
		
		
	}
	
	public static void currentAccount() {
		System.out.println("currentAccount child");
	}
}
