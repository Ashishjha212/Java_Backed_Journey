package com.kodewala.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayList10 {

	public static void main(String[] args) {
		List<String> students = new ArrayList<String>();
		
		//Adding students
		students.add("Ashish");
		students.add("Rahul");
		students.add("Amit");
		students.add("Ashish");
		students.add(null);
		students.add("Ashish");
		
		//Display all students
		System.out.println("All students");
		
		for(int i=0; i<students.size(); i++) {
			System.out.println(students.get(i));
		}
		
		//Total students
		System.out.println("Total students:"+students.size());
		
		//check particular student
		System.out.println(students.contains("Amit"));
		
		//Remove student
		students.remove(4);
		
		System.out.println("After removing Ashish:");
		System.out.println(students);
		
	}

}
