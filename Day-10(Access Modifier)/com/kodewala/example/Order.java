package com.kodewala.example;
//same package
public class Order{
	public static void main(String args[]){
		//creating an object of Customer class
		Customer customer = new Customer();
		
		//Accessing the default access member within the same package
		customer.sayHello("Kodewala");
		System.out.println("Customer Name:" +customer.customerName);
		
	}
}