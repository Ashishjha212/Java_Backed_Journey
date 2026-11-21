package com.kodewala.abstraction1;

interface Animal {
	void sleep();

	void eat();
}

class Elephant implements Animal {
	public void sleep() {
		System.out.println("Elephant sleeps everyday");
	}

	public void eat() {
		System.out.println("Elephant eat everyday");
	}
}

public class Main1 {

	public static void main(String[] args) {
		Animal animal = new Elephant();
		animal.eat();
		animal.sleep();

	}

}
