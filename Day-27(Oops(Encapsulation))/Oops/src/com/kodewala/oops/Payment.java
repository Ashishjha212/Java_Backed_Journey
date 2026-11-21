package com.kodewala.oops;

public class Payment {
	private int balance;

	public Payment(int _balance) {
		super();
		this.balance = _balance;
	}

	// setter
	public void doDebit(int _amount) {
		// Modifying the data
		balance = balance - _amount;
	}
	//setter
	public void doCredit(int _amount) {
		if (_amount > 0) {
			// modifying the data
			balance = balance + _amount;
		}
	}

	public int getBalance() {
		return balance;
	}

}
