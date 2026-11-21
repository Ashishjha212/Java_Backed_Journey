package com.kodewala.abstraction1;

public class Driver {

	public static void main(String[] args) {
		Vehicle car = new Car();
		car.startEngine();
		
		Vehicle bike = new Bike();
		bike.startEngine();
	}

}
