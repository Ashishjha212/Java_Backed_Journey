package com.kodewala.abstraction1;

abstract class Vehicle {
	abstract void startEngine();

}
class Car extends Vehicle{
	void startEngine() {
		System.out.println("It has a large size of engine");
	}
}

class Bike extends Vehicle{
	void startEngine() {
		System.out.println("It has a small size of engine");
	}
}