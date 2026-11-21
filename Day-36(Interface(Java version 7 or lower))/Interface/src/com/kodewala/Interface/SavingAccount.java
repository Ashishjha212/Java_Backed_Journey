package com.kodewala.Interface;

public class SavingAccount implements BankAccount{
	private double balance;
	public SavingAccount(double balance) {
		this.balance=balance;
	}

	@Override
	public double deposit(double amount) {
		balance = balance+amount;
		System.out.println(" Deposited " + amount + "in saving Account. New Balance: " + balance);
		return amount;
		
	}

	@Override
	public double withdraw(double amount) {
		if(balance-amount>=MIN_BALANCE) {
			balance = balance-amount;
			System.out.println("Withdrawn"+amount+ "from SavingAccount. New Balance"+balance);
		}else {
			System.out.println("Insuffient balance");
		}
		return amount ;
		
	}

	@Override
	public double checkBalance() {
		
		return balance;
	}

}
