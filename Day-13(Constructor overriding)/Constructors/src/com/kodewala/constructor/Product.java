package com.kodewala.constructor;

public class Product {
	String product_Name;
	int price;
	String description;
	int quantity;

	//default constructor without parameter
	Product() {

	}
	//constructor with 4 parameter
	public Product(String _product_Name, int _price, String _description, int _quantity) {

		this.product_Name = _product_Name;
		this.price = _price;
		this.description = _description;
		this.quantity = _quantity;
	}
	//constructor with 2 parameter
	public Product(String _product_Name, String _description) {

		this.product_Name = _product_Name;

		this.description = _description;
	}

}
