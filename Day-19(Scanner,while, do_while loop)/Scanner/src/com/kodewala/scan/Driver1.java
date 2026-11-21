package com.kodewala.scan;

import java.util.Scanner;

public class Driver1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the price");
		if(sc.hasNextInt())
		{
			int price = sc.nextInt();
		}else {
			System.out.println("please enter the price in right format");
		}
		
		int price = 0;
		System.out.println("price:"+price);
		
		sc.close();

	}

}
