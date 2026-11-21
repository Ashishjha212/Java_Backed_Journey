package com.kodewala.exception;

public class PaymentMgmt {
	public void doPayment(String account, int amount) {
		// check balance
		try {
			checkBalance(account, amount);
		} catch (InsufficientBalanceException e) {
			throw new FundTransferException(
					"you do not have enough balance OR " + " in case you have opened the account recently, "
							+ "please wait for 24hrs before doing fund transfer");
		}
	}

	private boolean checkBalance(String account, int amount) throws InsufficientBalanceException {
		boolean checkBalanceStatus = false;
		int balance = 1000; // from database
		if (amount > balance) {
			// balance is not enough
			throw new InsufficientBalanceException(
					account + "does not have enough balance and current balance is " + balance);

		} else {
			// allow to transfer fund
			checkBalanceStatus = true;
		}
		return checkBalanceStatus;
	}

}
