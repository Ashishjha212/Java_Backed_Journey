package com.kodewala.Interface1;

public interface Employee {
	default void work() {
		System.out.println("Employee is working");
	}

}
