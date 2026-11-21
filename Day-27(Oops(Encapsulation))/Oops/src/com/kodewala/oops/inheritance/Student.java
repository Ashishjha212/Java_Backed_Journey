package com.kodewala.oops.inheritance;

public class Student {
	private int age;
	private String name;
	private int noOfSub;
	private int id;
	private String gf;
	public Student(int age, String name, int noOfSub, int id, String gf) {
		super();
		this.age = age;
		this.name = name;
		this.noOfSub = noOfSub;
		this.id = id;
		this.gf = gf;
	}
	public String getName() {
		return this.name;
		
	}
	public String setName(String name) {
		return this.name=name;
		
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return this.age=age;
	}
	
	//Method
	public void study() {
		System.out.println(name + " Studying");
	}
	public void sleep() {
		System.out.println(name + " Sleeping");
	}
	public void bunk() {
		System.out.println(name + " Bunking");
	}
	private void gfChatting() {
		System.out.println(name + " gfChatting");
	}
	
	

}
