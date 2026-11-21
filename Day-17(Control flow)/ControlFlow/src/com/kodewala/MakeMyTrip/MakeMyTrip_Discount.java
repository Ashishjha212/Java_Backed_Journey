package com.kodewala.MakeMyTrip;

public class MakeMyTrip_Discount {

	public int discountApplied(int fare) {
		int maxDiscount = 1250;

		if ( fare > 0 && fare <5000) {
			System.out.println("Discount not applied");
		} else if (fare >= 5000 && fare <= 10000) {

			System.out.println("10% Discount is applied of total fare");
		} else if (fare > 10000) {
			System.out.println("15% Discount is applied of total fare");
			int discount = fare * 15 / 100;
			if (discount > maxDiscount) {
				System.out.println("Max discount exceed");
				int fare1 = fare -maxDiscount;
				System.out.println("After getting discount :"+fare1);
				
			}

		} else {
			System.out.println("Not a valid input");
		}
		return fare;

	}

}
