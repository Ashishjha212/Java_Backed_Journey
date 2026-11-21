package com.kodewala.Loop;

public class SumLoop {

	public static void main(String[] args) {
		int[] arr = { 25, 10, 31, 8, 44, 17, 6, 29, 12, 3 };
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % 2 != 0) {
				sum = sum + arr[i];

			}
		}
		System.out.println("The sum is:" + sum);

	}

}
