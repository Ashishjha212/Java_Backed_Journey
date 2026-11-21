package com.kodewala.oops.inheritance;

public class ClothProduct extends Product{
	String type;
	String category;
	public ClothProduct(String productName, String description, int quantity, String status, String type,
			String category) {
		super(productName, description, quantity, status);
		this.type = type;
		this.category = category;
	}
	public void viewClothing() {
		
			System.out.println(productName);
			System.out.println(description);
			System.out.println(quantity);
			System.out.println(status);
			System.out.println(type);
			System.out.println(category);
			
		}
	}


