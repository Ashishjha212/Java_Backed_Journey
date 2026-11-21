package com.kodewala.inheritance1;

public class Bike extends Vehicle {
	int engineCapacity;

	public Bike(String brand, String registrationNumber, double rentalPrice, int engineCapacity) {
		super(brand, registrationNumber, rentalPrice);
		this.engineCapacity = engineCapacity;
	}
	public void displayBikeDetails() {
		System.out.println(brand);
		System.out.println(registrationNumber);
		System.out.println(rentalPrice);
		System.out.println(engineCapacity);
	}

}
