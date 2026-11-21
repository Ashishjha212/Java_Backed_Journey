package com.kodewala.inheritance;
class Account{
	public void openAccount(String userId, String email) {
		System.out.println("Account.openAccount()");
		System.out.println(userId+   " " +email);
	}
}
class SavingAccount extends Account{
	@Override
	public void openAccount(String userId, String email) {
		System.out.println("SavingAccount.openAccount()");
		System.out.println(userId+   " " +email);
	}
}
class SrCitAccount extends SavingAccount{
	@Override
	public void openAccount(String userId, String email) {
		System.out.println("SrCitAccount .openAccount()");
		System.out.println(userId+   " " +email);
	}
}
class PensionAccount extends SrCitAccount{
	@Override
	public void openAccount(String userId, String email) {
		System.out.println("PensionAccount.openAccount()");
		System.out.println(userId+   " " +email);
	}
}
public class Driver {

	public static void main(String[] args) {
		PensionAccount pensionAccount = new PensionAccount();
		pensionAccount.openAccount("Aj123", "Aj123@gmail.com");

	}

}
