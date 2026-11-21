package com.kodewala.oops;

public class Driver {

	public static void main(String[] args) {
		Payment payment = new Payment(1000);
		payment.doCredit(200);
		//System.out.println(payment.getBalance());
//		payment.balance=100000;
//		System.out.println(payment.balance);
	    int balance = payment.getBalance();
		System.out.println("After credit balance is:" + balance);
		payment.doDebit(300);
		int balance1 = payment.getBalance();
		System.out.println("After debit balance is:" + balance1);

	}

}
