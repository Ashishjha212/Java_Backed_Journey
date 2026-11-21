package com.kodewala.exception;

public class Driver1 {

	public static void main(String[] args) {
		Driver1 driver1 = new Driver1();
		int result = driver1.calculateDiscount(100, 10);
		System.out.println(result);

	}

	public int calculateDiscount(int amount, int disc) {
		int finalAmt = 0;
		try {
			finalAmt = amount - (amount * disc / 100);
			//return finalAmt;
		} catch (Exception e) {
			System.out.println("Some exception....");
			e.printStackTrace();
		} finally {
			finalAmt = 110;
			
		}
		return finalAmt;
		
		
		
		

	}

}
