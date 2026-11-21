package com.kodewala.string;

public class AccountMgmt {
	int UPI_LIMIT = 100000;

	public final void  doSomething() {
		UPI_LIMIT = 200000;
	}

	public void doSomething2() {
		System.out.println("Ashish");
	}

}

class Account extends AccountMgmt {
	//@Override
	//public  void doSomething() {
		
	//}

	@Override
	public final void doSomething2() {

	}

}
 class Driver2{
	public static void main(String[] args) {
		
	}
}
