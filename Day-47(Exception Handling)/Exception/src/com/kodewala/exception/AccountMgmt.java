package com.kodewala.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class AccountMgmt {
	void openAccount(String name, String address)
	{
		System.out.println("AccountMgmt.openAccount().....START");
		activateAccount("345678884");
		System.out.println("AccountMgmt.openAccount().....END");
		
	}
	private void activateAccount(String accNo)
	{
		System.out.println("AccountMgmt.activateAccount() START");
		
			checkAccountStatus(null);
			
		
		System.out.println("AccountMgmt.activateAccount() END");
	}
	private boolean checkAccountStatus(String accNo) 
	{
		try {
			accNo.startsWith("SBI"); //NPE --> risky code
		}catch(NullPointerException e) {
			//throw--> create new exception object and throw it to the caller
			throw new NullPointerException("Something is null");
		}
		return false;
	}

}
