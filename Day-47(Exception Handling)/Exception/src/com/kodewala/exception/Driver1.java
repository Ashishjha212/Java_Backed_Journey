package com.kodewala.exception;

public class Driver1 {

	public static void main(String[] args) {
		System.out.println("Driver.main() START");
		PaymentMgmt paymentMgmt = new PaymentMgmt();
		try {
			paymentMgmt.doPayment("765432222", 1500);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Driver.main() END");

	}

}
