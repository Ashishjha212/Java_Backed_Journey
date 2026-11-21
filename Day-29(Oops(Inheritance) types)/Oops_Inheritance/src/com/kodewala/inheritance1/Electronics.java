package com.kodewala.inheritance1;

public class Electronics extends Product{
	int warrantyInYears;

	public Electronics(String productId, String productName, double price, int warrantyInYears) {
		super(productId, productName, price);
		this.warrantyInYears = warrantyInYears;
	}
	public void displayWarranty() {
		System.out.println(productId);
		System.out.println(productName);
		System.out.println(price);
		System.out.println(warrantyInYears);
	}

}
