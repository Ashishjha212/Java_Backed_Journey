package com.kodewala.polymorphism;

public class NetBankingPayment extends Payment {
	@Override
	public void doPayment() {
		System.out.println("NetBankingPayment.doPayment()......... NetBankingPayment");
	}

}
