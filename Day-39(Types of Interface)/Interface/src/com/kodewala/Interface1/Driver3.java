package com.kodewala.Interface1;

public class Driver3 {

	public static void main(String[] args) {
		Calculator calculate = (a, b) -> {
			System.out.println("Addition " + (a + b));
			System.out.println("Substraction " + (a - b));
			System.out.println("Multiplication " + (a * b));
			System.out.println("Division " + (a / b));
			return a;

		};
		calculate.claculate(10, 5);

	}

}
