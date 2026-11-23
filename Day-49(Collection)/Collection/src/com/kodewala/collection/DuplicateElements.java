package com.kodewala.collection;

import java.util.ArrayList;
import java.util.List;

public class DuplicateElements {

	public static void main(String[] args) {
		List<String> students = new ArrayList<String>();
		students.add("Ashish");
		students.add("Rahul");
		students.add("Ashish");
		students.add("Amit");
		students.add("Rahul");
		System.out.println(students);
	}

}
