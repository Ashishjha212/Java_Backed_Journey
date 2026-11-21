package com.kodewala.Interface;

public interface BankServices {
	public abstract void deposit(double amount);

	public abstract void applyLoan(double d);

}
interface LoanServices{
	public abstract void applyLoan(double amount);
}
class Customer implements BankServices,LoanServices{

	@Override
	public void deposit(double amount) {
		System.out.println("Deposited :" +amount);
		
		
	}

	@Override
	public void applyLoan(double amount) {
		System.out.println("Loan applied for :"+amount);
		
	}
	
}
