package com.kodewala.constructor;

public class Person {
	String name;
	Person(String _name){
		this.name = _name;
	}

}
class Employee extends Person{
	int id;
	Employee(String _name,int _id){
		super(_name);
		this.id=_id;
	}
}

