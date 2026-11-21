package com.kodewala.Switch;

public class Ecommerce {
	int purchaseValue;
	int discount;
	int maxDiscount = 2500;

	public void discount(int purchaseValue, String type) {

		if (purchaseValue >= 1000) {

			switch (type) {
			case "Gold":

				System.out.println("For gold customer discount is 20%");
				discount = (purchaseValue * 20) / 100;
				if (discount < maxDiscount) {
					System.out.println("Discount is:" + discount);
					break;
				} else {
					System.out.println("Applicable for 2500 discount only...");
					break;
				}

			case "Silver":

				System.out.println("For silver customer discount will be 10%");
				discount = (purchaseValue * 10) / 100;
				if (discount < maxDiscount) {
					System.out.println("Discount is:" + discount);
					break;
				} else {
					System.out.println("Applicable for 2500 discount only...");
					break;
				}

			case "Regular":
				System.out.println("For regular customer discount will be 5%");
				discount = (purchaseValue * 5) / 100;
				if (discount < maxDiscount) {
					System.out.println("Discount is:" + discount);
					break;
				} else {
					System.out.println("Applicable for 2500 discount only...");
					break;
				}
				
				default:
					System.out.println("Enter valid input user for Customer type");
					break;
			

			}

		} else {
			System.out.println("Discount is not applied");
		}
	}

}
