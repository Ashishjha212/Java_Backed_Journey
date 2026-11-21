package com.kodewala.oops.inheritance;

public class Driver2 {

	public static void main(String[] args) {
		Product product = new Product("Iphone", "This is Iphone", 7, "In-stock");
		product.viewProductDetails();
		ElectronicProduct electronicProduct = new ElectronicProduct("Kettle", "AutoCut is also there", 5, "In-stock", true, 2);
		electronicProduct.viewElectronicProductDetails();
		ClothProduct clothproduct = new ClothProduct("jeans", "New style in market", 6, "In-stock", "cotton", "baggy jeans");
		clothproduct.viewClothing();
		

	}

}
