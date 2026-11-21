package com.kodewala.inheritance1;

public class Product {
	String productId;
	String productName;
	double price;
	public Product(String productId, String productName, double price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}
	void displayProductDetails() {
		System.out.println(productId);
		System.out.println(productName);
		System.out.println(price);
	}

}
