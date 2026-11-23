package com.kodewala.collection;

import java.util.ArrayList;

public class ArrayVsCollection {

	public static void main(String[] args) {
		//Array
		String students[] = new String[3];
		students[0]="Ashish";
		students[1]="Rahul";
		students[2]="Amit";
		
		//ArrayList
		ArrayList<String> learners = new ArrayList<String>();
		learners.add("Ashish");
		learners.add("Rahul");
		learners.add("Amit");
		learners.add("Rohit");
		
		System.out.println("Array Elements");
		
		for(String name:students) {
			System.out.println(name);
		}
		
		System.out.println("ArrayList Elements");
		
		for(String name:learners) {
			System.out.println(name);
		}
		
		

	}

}
