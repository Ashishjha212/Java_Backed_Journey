package com.kodewala.oops.inheritance;

public class ElectronicProduct extends Product {
	boolean isWarranty;
	int warrentyInYears;

	public ElectronicProduct(String productName, String description, int quantity, String status, boolean isWarranty,
			int warrentyInYears) {
		super(productName, description, quantity, status);
		this.isWarranty = isWarranty;
		this.warrentyInYears = warrentyInYears;
	}

	public void viewElectronicProductDetails() {
		System.out.println(productName);
		System.out.println(description);
		System.out.println(quantity);
		System.out.println(status);
		
		System.out.println(isWarranty);
		System.out.println(warrentyInYears);
	}

}
