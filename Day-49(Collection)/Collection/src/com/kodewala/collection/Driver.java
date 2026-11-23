package com.kodewala.collection;

public class Driver {

	public static void main(String[] args) 
	{
		int products[] =new int[100]; //It can hold max 100 products. if you have 200 products,
		                              //you need to recreate 
		//1.store the price --> container(box) which holds the integer value
		int price[] = {200,5000,100,200,300,500,23456,5600}; //Memory --> Heap --> if you want to store permanent then store in Database.
		
		//2. process --> find the price value above 1000
		for(int index=0; index <price.length; index++) {
			int currentPrice=price[index];
			if(currentPrice > 1000) {
				System.out.println(currentPrice);
			}
		}
		
	}

}
