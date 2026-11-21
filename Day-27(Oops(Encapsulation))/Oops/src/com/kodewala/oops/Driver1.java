package com.kodewala.oops;

public class Driver1 {

	public static void main(String[] args) {
		Fund_Transfer fundTransfer = new Fund_Transfer(1000, "Aj123456", "Ashish Jha");
		System.out.println("Initial original balance :"+fundTransfer.getOriginalBalance());
		fundTransfer.doTransactionDebit(200);
		int balance = fundTransfer.getBalance();

		System.out.println("Customer Name:"+fundTransfer.getAccountHolderName());
		System.out.println("Customer Account No:"+fundTransfer.getAccountNumber());

		System.out.println("After credit balance is:" + balance);
		fundTransfer.doTransactionCredit(900);
		int balance1 = fundTransfer.getBalance();
		System.out.println("After debit balance is:" + balance1);

	}

}
