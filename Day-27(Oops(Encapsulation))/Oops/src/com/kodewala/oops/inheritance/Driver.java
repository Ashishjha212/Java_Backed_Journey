package com.kodewala.oops.inheritance;

public class Driver {

	public static void main(String[] args) {
		Student s = new Student(25, "Ashish", 5, 5678, "Manisha");
//		System.out.println(s.age);
		System.out.println(s.getName());
		s.setName("Abhinav");
		System.out.println(s.getName());
		s.setAge(28);
		System.out.println(s.getAge());
//		System.out.println(s.noOfSub);
//		System.out.println(s.id);
		//System.out.println(s.gf);
		
		s.study();
		s.sleep();
		s.bunk();

	}

}
