package com.kodewala.Interface;
//Java version 1.7 or 7 before interface does not have body
public interface IDiscount {
	int MAX_VALUE=100; //by default it is public static final
	
	public abstract int calculateDiscount(int amount, int rate); //This part we can say abstract just an idea with no implementation 

	public abstract void calculateDiscountTax(int tax);

}
