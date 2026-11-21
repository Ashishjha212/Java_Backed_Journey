package com.kodewala.oops;

public class Student {
	private int age;
	
	

	public Student(int age) {
		super();
		this.age = age;
	}
	public void setAge(int age) {
		if(age>0) {
			this.age=age;
		}else {
			System.out.println("Invalid age");
		}
	}
	public int getAge() {
		return age;
	}

}
