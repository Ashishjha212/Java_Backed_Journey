package com.kodewala.oops.revision;

public class Driver {

	public static void main(String[] args) {
		Delivery delivery = new Delivery();
		delivery.doDelivery();
		
		Delivery delivery1 = new ExpressBee();
		delivery1.doDelivery(); //child class object ExpressBee() method will be called.
		
		Delivery delivery2 = new Ekart();
		delivery2.doDelivery(); //child class object Ekart() method will be called.
		
	
		
		ExpressBee expressBee1 = (ExpressBee)delivery1; //it will not throw classcast at runtime
		expressBee1.doDelivery();
		
		ExpressBee expressBee = (ExpressBee) new Delivery(); //Classcast at runtime
		expressBee.doDelivery();
		
		
		

	}

}
