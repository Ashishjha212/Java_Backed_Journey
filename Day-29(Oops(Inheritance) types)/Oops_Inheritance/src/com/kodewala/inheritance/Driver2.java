package com.kodewala.inheritance;

class Product1 {
	String productName;
	String description;

	public Product1(String productName, String description) {
		super();
		this.productName = productName;
		this.description = description;
	}

}

class ElectronicProduct1 extends Product {
	int warrenty;

	public ElectronicProduct1(String productName, String description, int warrenty) {
		super(productName, description);
		this.warrenty = warrenty;
	}

	public void displayElectronicProduct() {
		System.out.println(productName);
		System.out.println(description);
		System.out.println(warrenty);
	}

}

class ClothsProduct extends Product1 {
	String type;
	String colour;

	public ClothsProduct(String productName, String description, String type, String colour) {
		super(productName, description);
		this.type = type;
		this.colour = colour;
	}

	public void displayCloth() {
		System.out.println(productName);
		System.out.println(description);
		System.out.println(type);
		System.out.println(colour);
	}
}

	public class Driver2 {

		public static void main(String[] args) {

			ClothsProduct clothsProduct = new ClothsProduct("Jeans", "New trend", "Baggy", "Blue");

			clothsProduct.displayCloth();

		}

	}

