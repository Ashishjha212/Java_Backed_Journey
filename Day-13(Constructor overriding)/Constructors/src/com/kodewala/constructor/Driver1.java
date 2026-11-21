package com.kodewala.constructor;

public class Driver1 {

	public static void main(String[] args) {

		Product prd = new Product(); // calling the default constructor without argument
		System.out.println(prd.product_Name + " " + prd.price + " " + prd.description + " " + prd.quantity);

		Product prod1 = new Product("shoes", 500, "Adidas", 20);// calling the constructor with 4 argument
		System.out.println(prod1.product_Name + " " + prod1.price + " " + prod1.description + " " + prod1.quantity);

		Product prod2 = new Product("shoes", "Adidas");
		System.out.println(prod2.product_Name + " " + prod2.description); // calling the constructor with 2 argument

	}

}
