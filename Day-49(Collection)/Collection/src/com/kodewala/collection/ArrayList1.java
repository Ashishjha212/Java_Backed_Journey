package com.kodewala.collection;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		//create a container which will hold something(Objects)
		ArrayList<String> learners = new ArrayList<String>();
		//Storing the data
		learners.add("Gautam");
		learners.add("Prince");
		learners.add("Aman");
		learners.add("Rohit");
		learners.add("Gautam");
		learners.add("Aman");
		learners.add(null);
		learners.add(null);
		
		//Read the data from container or ArrayList
		System.out.println(learners);
		
	}

}
