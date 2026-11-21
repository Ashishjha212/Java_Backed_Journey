package com.kodewala.Switch;

import java.util.Scanner;

public class Driver2 {

	public static void main(String[] args) {
		System.out.println("The type of Customer is 1.Gold, 2.Silver, 3.Regular");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the purchaseValue of customer");
		int purchaseValue = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the customerType");
		String type = sc.nextLine();
		Ecommerce ecommerce = new Ecommerce();
		ecommerce.discount(purchaseValue, type);
		sc.close();

	}

}
