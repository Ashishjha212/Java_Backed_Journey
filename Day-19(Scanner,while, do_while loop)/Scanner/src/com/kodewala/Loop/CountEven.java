package com.kodewala.Loop;

public class CountEven {

	public static void main(String[] args) {
		int[] arr1 = { 21, 4, 16, 9, 2, 13, 18, 7, 10 };
		int count = 0;
		for (int i = 0; i < arr1.length; i++) {
			
			if (arr1[i] % 2 == 0) {
				count++;

			}
		}
		System.out.println("The total number of even is:"+count);
	}

}
