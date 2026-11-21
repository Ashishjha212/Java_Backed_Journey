package com.kodewala.inheritance1;

public class Vehicle {
	String brand;
	String registrationNumber;
	double rentalPrice;


	public Vehicle(String brand, String registrationNumber, double rentalPrice) {
		super();
		this.brand = brand;
		this.registrationNumber = registrationNumber;
		this.rentalPrice = rentalPrice;
		
	}

	public void calculateRentalCost(int days) {
		rentalPrice = rentalPrice * days;

	}
	public void displayDetails() {
		System.out.println(brand);
		System.out.println(registrationNumber);
		System.out.println(rentalPrice);
		
		
	}

}
