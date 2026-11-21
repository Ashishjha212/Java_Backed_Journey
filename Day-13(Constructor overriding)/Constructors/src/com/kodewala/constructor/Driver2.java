package com.kodewala.constructor;

public class Driver2 {

	public static void main(String[] args) {
		Product1 pro = new Product1("Fan",5000,"Advanced BLDC motor technology",5);
		System.out.println("Product name :" +pro.productName+ " " +"Product price :" +pro.price+ " " +"product description :"+pro.description+ " " +"Product quantity :"+pro.quantity);
		
		Product1 pro1 = new Product1("Shoes","Sports shoes");
		System.out.println("Product name :" +pro1.productName+ " "  +"product description :"+pro1.description);
		
		Product1 pro2 = new Product1();
		System.out.println("Product name :" +pro2.productName+ " " +"Product price :" +pro2.price+ " " +"product description :"+pro2.description+ " " +"Product quantity :"+pro2.quantity);
		
		
		

	}

}
