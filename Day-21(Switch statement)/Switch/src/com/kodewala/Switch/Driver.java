package com.kodewala.Switch;

public class Driver {

	public static void main(String[] args) {
		Driver driver = new Driver();
		int day = Integer.parseInt(args[0]);
		driver.identifyDay(day);

	}

	public void identifyDay(int number) {
		switch (number) {
		case 1:
			System.out.println("Mon");
			break;
		case 2:
			System.out.println("Tue");
			break;
		case 3:
			System.out.println("Wed");
			break;
		case 4:
			System.out.println("Thur");
			break;
		case 5:
			System.out.println("Fri");
			break;
		case 6:
			System.out.println("Sat");
			break;
		case 7:
			System.out.println("Sun");
			break;
		default:
			System.out.println("Please enter valid input[1-7]");

		}

	}

}
