package com.kodewala.oops.revision;

public class Delivery {
	public void doDelivery() {
		System.out.println("Delivery.doDelivery()");
	}

}

class ExpressBee extends Delivery{
	@Override
	public void doDelivery() {
		System.out.println("ExpressBee.doDelivery()");
	}
}

class Ekart extends Delivery{
	@Override
	public void doDelivery() {
		System.out.println("Ekart.doDelivery()");
	}
}


