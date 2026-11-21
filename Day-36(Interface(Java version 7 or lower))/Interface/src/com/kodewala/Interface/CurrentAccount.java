package com.kodewala.Interface;

public class CurrentAccount implements BankAccount{
	private double balance;
	
	public CurrentAccount(double balance) {
		super();
		this.balance = balance;
	}

	@Override
	public double deposit(double amount) {
		balance = balance+amount;
		System.out.println("Deposited" +amount+ "in Current Account. New Balance: " + balance);
		return amount;
		
	}

	@Override
	public double withdraw(double amount) {
		balance = balance-amount;
		System.out.println("Withdrawn"+amount+ "from CurrentAccount. New Balance"+balance);
		return amount;
		
	}

	@Override
	public double checkBalance() {
		
		return balance;
	}

}
