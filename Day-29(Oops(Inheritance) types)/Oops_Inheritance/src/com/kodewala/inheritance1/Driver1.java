package com.kodewala.inheritance1;

public class Driver1 {

	public static void main(String[] args) {
		Car car = new Car("Maruti suzuki", "AJ12345", 2000);
		car.calculateRentalCost(3);
		car.displayCarDetails();
		System.out.println("---------------------------");
		Bike bike = new Bike("Bullet","Aj123",1000.0, 5);
		bike.calculateRentalCost(3);
		bike.displayBikeDetails();

	}

}
