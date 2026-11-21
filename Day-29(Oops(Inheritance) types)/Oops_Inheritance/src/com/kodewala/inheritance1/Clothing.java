package com.kodewala.inheritance1;

public class Clothing extends Product {
	String size;

	public Clothing(String productId, String productName, double price, String size) {
		super(productId, productName, price);
		this.size = size;
	}
	public void displaySize() {
		System.out.println(productId);
		System.out.println(productName);
		System.out.println(price);
		System.out.println(size);
	}
	

}
