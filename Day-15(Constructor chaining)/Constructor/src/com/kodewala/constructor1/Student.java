package com.kodewala.constructor1;

public class Student {
	String name;
	int age;
	String course;
	
	//constructor
	Student(){
		this("unknown",18);
		System.out.println("No-args constructor");
	}
	
	Student(String name,int age){
		this("name",age,"Not Assigned");
		System.out.println("Two-args constructor");
	}
	
	Student(String _name,int _age,String _course){
		this.name=_name;
		this.age=_age;
		this.course=_course;
		System.out.println("Three-args constructor");
	}

}
