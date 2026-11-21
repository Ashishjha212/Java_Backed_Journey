package com.kodewala.inheritance1;

public class Driver {

	public static void main(String[] args) {
		Electronics electronic = new Electronics("Lp123","Laptop",30000.0, 2);
		electronic.displayWarranty();
		System.out.println("------------------------");
		Clothing clothing = new Clothing("Sr123","Shirt",1000.0,"Medium");
		clothing.displaySize();

	}

}
