package com.kodewala.scanner;

import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int luckyNumber = 5;
		int userEntered = 10 ;
		while(luckyNumber != userEntered) {
			System.out.println("please enter the number....");
			userEntered = sc.nextInt();
			
			if(userEntered == luckyNumber) {
				System.out.println("You won....");
			}else {
				System.out.println("Please try again");
			}
		}
	}

}
