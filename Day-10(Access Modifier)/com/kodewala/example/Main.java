package com.kodewala.example;
public class Main{
	public static void main(String args[]){
		BankAccount account = new BankAccount();
		account.deposit(1000);
		System.out.println("Balance:" +account.getBalance());
		account.deposit(2000);
		System.out.println("Balance:" +account.getBalance());
		
		
	}
}