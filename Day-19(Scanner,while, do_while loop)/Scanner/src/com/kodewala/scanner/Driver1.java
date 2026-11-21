package com.kodewala.scanner;

import java.util.Scanner;

public class Driver1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int price=0;
		System.out.println("please enter the price");
		//Before entering the price make sure the user is applying int only
		if(sc.hasNextInt()) {
			price = sc.nextInt();
		}
		else {
			System.out.println("please enter price in right format");
		}
		System.out.println("price is "+price);
		sc.close();
	}

}
