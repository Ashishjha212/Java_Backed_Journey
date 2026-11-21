package com.kodewala.inheritance1;

public class Car extends Vehicle {
	int numberOfSeats;

	public Car(String brand, String registrationNumber, double rentalPrice) {
		super(brand, registrationNumber, rentalPrice);
		this.numberOfSeats = numberOfSeats;
	}
	public void displayCarDetails() {
		System.out.println(brand);
		System.out.println(registrationNumber);
		System.out.println(rentalPrice);
		
	}
	

}
