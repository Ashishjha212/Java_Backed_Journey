package com.amazon.sample;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String args[]) {
		System.out.println("Hello world from eclipse IDE");
		int amount = 200;
		System.out.println("Amount is : " + amount);
		HelloWorld.doSomething();
		Scanner sc = new Scanner(System.in);
	}

	public static void doSomething() {
		System.out.println("welcome to IDE");
	}

}
