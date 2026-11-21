package com.kodewala.staticblock;
class AccountMgmt{
	public AccountMgmt() {
		System.out.println("AccountMgmt.AccountMgmt()....");
	}
}

public class Account extends AccountMgmt {
	String accountNumber;
	//instance init block --> this will get executed whenever object is created
	{
		System.out.println("Account IIB Block1");
	}
	
	public Account(String accountNumber) {
		super();//1st line
		//call to init block--> IIB --> 2nd line
		System.out.println("Account (String accountNumber)");
		this.accountNumber = accountNumber;
	}
	
	{
		System.out.println("Account IIB Block2");
	}

	
}
