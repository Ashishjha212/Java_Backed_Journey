package com.kodewala.collection;

import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {
		ArrayList<String> products = new ArrayList<String>(); //creating an ArrayList of elctronics products
		//Adding elements
		products.add("Laptop");
		products.add("Smartphone");
		products.add("Headphones");
		
		System.out.println("Electronics products:"+products); //printing the list
		System.out.println("First product "+products.get(0));
		
		products.remove("Smartphone");
		System.out.println("Afer removing smartphone:"+products);
		
		System.out.println("Total products:"+products.size());
		
	}

}
