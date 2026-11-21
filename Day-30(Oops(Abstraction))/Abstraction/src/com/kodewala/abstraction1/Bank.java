package com.kodewala.abstraction1;

abstract class Bank {
	abstract void loanInterestRate();

}
class HDFC extends Bank{
	void loanInterestRate() {
		System.out.println("HDFC Loan Interest Rate: 8.2% ");
	}
}

