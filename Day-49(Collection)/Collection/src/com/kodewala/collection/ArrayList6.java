package com.kodewala.collection;

import java.util.ArrayList;

public class ArrayList6 {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Ashish");
		names.add("Abhinav");
		names.add("Rahul");
		names.add("Rohit");
		names.add("Rajnish");
		System.out.println("Before removing"+names);
		names.remove(2);
		System.out.println("After removing"+names);
		
	}

}
