package com.kodewala.oops;

public class Fund_Transfer {
	private String accountHolderName;
	private String accountNumber;
	private int balance;

	public Fund_Transfer(int _balance, String _accountNumber, String _accountHolderName) {
		this.balance = _balance;
		this.accountNumber = _accountNumber;
		this.accountHolderName = _accountHolderName;
	}

	public void doTransactionCredit(int _transactionAmount) {
		// Modifying the data
		if (_transactionAmount <= balance) {
			if (_transactionAmount > 0) {
				balance = balance - _transactionAmount;
			} else {
				System.err.println("transaction should be greater then 0");
			}
		} else {
			System.err.println("Transaction Amount should be less than or equal to current balance");
		}

	}

	public void doTransactionDebit(int _transactionAmount) {
		if (_transactionAmount <= balance) {
			if (_transactionAmount > 0) {
				// modifying the data
				balance = balance + _transactionAmount;
			} else {
				System.err.println("transaction should be greater then 0");
			}
		} else {
			System.err.println("Transaction Amount should be less than or equal to current balance");
		}

	}

	public int getBalance() {
		return balance;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public int getOriginalBalance() {
		return balance;
	}
}
