package com.kodewala.staticblock;
class A{
	static {
		System.out.println("Static block A");
	}
}
public class Block1 {
	static {
		System.out.println("static block main");
	}

	public static void main(String[] args) {
		System.out.println("Main method");
		A obj1 = new A();
		A obj2 = new A();
	}

}
