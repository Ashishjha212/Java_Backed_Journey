package com.kodewala.constructor;

public class Product1 {
	String productName;
	int price;
	String description; 
	int quantity;

	public Product1(String _productName, int _price, String _description, int _quantity) {
		this.productName = _productName;
		this.price = _price;
		this.description = _description;
		this.quantity = _quantity;

	}

	public Product1(String _productName, String _description) {
		this.productName = _productName;
		this.description = _description;

	}

	Product1() {
		System.out.println("Without any attributes");
	}

}
