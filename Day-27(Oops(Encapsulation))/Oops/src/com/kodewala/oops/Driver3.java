package com.kodewala.oops;

public class Driver3 {

	public static void main(String[] args) {
		Student1 stu1 = new Student1();
		stu1.newName("Ashish");
		//stu1.name="Abhinav";
		System.out.println("Name "+stu1.getName());
		stu1.currentAge(25);
		System.out.println("Age "+stu1.getAge());
		stu1.totalMarks(85.6);
		System.out.println("Marks "+stu1.getMarks());
		
	}

}
