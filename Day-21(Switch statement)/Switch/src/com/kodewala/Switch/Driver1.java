package com.kodewala.Switch;

import java.util.Scanner;

public class Driver1 {

	public static void main(String[] args) {
		SwitchCase switchcase = new SwitchCase();
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the value of day");
		int day =Integer.parseInt(args[0]);
		switchcase.identifyDay(day);
		

	}

}
