package com.kodewala.inheritance;
class Product{
	String productName;
	String description;
	public Product(String productName, String description) {
		super();
		this.productName = productName;
		this.description = description;
	}
	
}
class ElectronicProduct extends Product{
	int warrenty;

	public ElectronicProduct(String productName, String description, int warrenty) {
		super(productName, description);
		this.warrenty = warrenty;
	}
	public void displayElectronicProduct() {
		System.out.println(productName);
		System.out.println(description);
		System.out.println(warrenty);
	}
	
}

public class Driver1 {

	public static void main(String[] args) {
		ElectronicProduct electronicProduct = new ElectronicProduct("Realme 12 Pro", "This is new model", 2);
		electronicProduct.displayElectronicProduct();
		

	}

}
