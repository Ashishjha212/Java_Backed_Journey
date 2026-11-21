package com.kodewala.exception1;

public class Driver1 {

	public static void main(String[] args) {
		Account account = new Account();
		String accNo = "SBI4556544";
		String address[] = { "Btm Bangalore", "Jp Nagar Bangalore" };
		account.doActivateAcc(accNo, address);

	}

}

class Account {
	void doActivateAcc(String accNo, String address[]) {
		System.out.println("Account.doActivateAcc() START");
		validateAccDetails(accNo, address);
		System.out.println("Account.doActivateAcc() END");
	}

	public boolean validateAccDetails(String accNo, String address[]) {

		System.out.println("Account.validateAccDetails() START");

		System.out.println("Validating account number...");
		System.out.println("Account number received: " + accNo);
		boolean isValid = false;
		try {
			String homeAddress = address[0];
			System.out.println("homeAddress:" + homeAddress);
			isValid = accNo.startsWith("SBI"); // NPE if accNo is null
			int amount = 100 / 0;
			int accNOInt = Integer.parseInt(accNo);
		} catch (NullPointerException e) { //child
			System.out.println("Value is null");
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) { //child
			System.out.println("You are trying to get an values from invalid index");
			e.printStackTrace();
		} 
		catch (ArithmeticException e) { //child
			System.out.println("Arithmetic exception number/by zero");
			e.printStackTrace();
		}

		catch (Exception e) { //parent
			System.out.println("Unknown Error.......");
			e.printStackTrace();
		}
		System.out.println("Account.validateAccDetails() END");

		return isValid;
	}
}
