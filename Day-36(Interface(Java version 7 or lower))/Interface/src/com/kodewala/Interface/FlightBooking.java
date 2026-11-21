package com.kodewala.Interface;

public class FlightBooking extends Object  implements IDiscount{

	@Override
	public int calculateDiscount(int amount, int rate) {
		int finalFare = amount -(amount*rate)/100;
		return finalFare;
	}

	@Override
	public void calculateDiscountTax(int tax) {
	System.out.println("FlightBooking.calculateDiscountTax(int tax)..");
		
	}

}
