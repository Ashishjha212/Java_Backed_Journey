package com.kodewala.constructor;

public class Driver {
	
		 public  static void main(String[] args) {
			Invoice inv = new Invoice(20000, "Realme", "Btm layout 2nd stage", "c123", "Ashish");
			Invoice inv1 = new Invoice(15000, "Readme", "Btm layout 1st stage", "c124", "Rajnish");
			
			System.out.println("First invoice :"+inv.amount+" , "+inv.customerId+ " ," +inv.gst);
			System.out.println("Second invoice :"+inv1.amount+" , "+inv1.customerId+ " ," +inv1.gst);
			
			
		}

}
