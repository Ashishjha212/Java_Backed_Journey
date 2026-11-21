package com.kodewala.sbi;

public class Driver {



	public static void main(String[] args) {
		Customer customer = new Customer("Ashish", 50000, "6787456789");
		Customer customer1 = new Customer("Abhinav", 1000, "6787456788");
		Customer customer2 = new Customer("Rajnish", 500, "678745567");
		Customer customer3 = new Customer("Rohit", 20000, "6787456674");
		Customer customer4 = new Customer("Mohan", 30000, "6787456898");
		
		Customer cus[] = new Customer[5];
		cus[0]=customer;
		cus[1]=customer1;
		cus[2]=customer2;
		cus[3]=customer3;
		cus[4]=customer4;
		
		for(int i =0; i<cus.length; i++) {
			
			if(cus[i].balance < 2000) {
				
				System.out.println(cus[i].name+ " "+cus[i].balance);
				
			}
				
			
		}
		
		

	}

}
