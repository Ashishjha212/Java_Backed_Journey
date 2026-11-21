package com.kodewala.example;
public class BankAccount{
	private double balance;
	
	private void updateBalance(double amount){
		balance = balance+amount;
	}
	public void deposit(double amount){
	if (amount >0){
			updateBalance(amount);
			System.out.println("Deposit successful. Current balance :" +balance);
		}
	}
	public double getBalance(){
		return balance;
	}
}