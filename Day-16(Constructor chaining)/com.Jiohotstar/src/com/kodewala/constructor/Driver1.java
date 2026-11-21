package com.kodewala.constructor;

public class Driver1 {

	public static void main(String[] args) {
		ElectronicItem electronicItem = new ElectronicItem("Google_pixel", 60000, "gp2345", 5);
		System.out.println(electronicItem.name);
		System.out.println(electronicItem.price);
		System.out.println(electronicItem.itemId);
		System.out.println(electronicItem.warrenty);
		

	}

}
