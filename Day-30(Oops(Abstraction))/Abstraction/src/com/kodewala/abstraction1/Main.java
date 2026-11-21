package com.kodewala.abstraction1;

abstract class Bird {
	abstract void fly();

	abstract void eat();
}

class Sparrow extends Bird{
	public void fly() {
		System.out.println("Sparrow flying in different way");
	}
	public void eat() {
		System.out.println("Sparrow eating");
	}
}

public class Main {
	public static void main(String[] args) {
		Bird b = new Sparrow();
		b.eat();
		b.fly();
	}

}
