package com.kodewala.scan;

public class Driver3 {

	public static void main(String[] args) {
		int[] arr = { 10, -5, 20, -15, 8, -3, 25, -10, 7, -2 };
		// Multiply postive number by 10
		for (int i = 0; i < arr.length; i++) {
			int currentNumber = arr[i];
			if(currentNumber < 0) {
				continue;
			}
			System.out.println(currentNumber*10);

		}

	}

}
