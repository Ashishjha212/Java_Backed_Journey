package com.kodewala.Loop;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = sc.nextInt();
		while(num <= 10) {
			System.out.println("The number is invalid enter greater then 10");
			num = sc.nextInt();
			
		}
		System.out.println("You entered " +num);
		
		
		
	}

}
