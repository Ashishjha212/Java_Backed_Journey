package com.kodewala.oops.revision;

public class DeliveryPartner extends Object {

	/**
	 * ** * Represents a delivery partner responsible for delivering orders * from
	 * the seller to the customer. * * This class extends the Object class by
	 * default. * * @author Ashish
	 * @since JDK 1.8
	 */
	
	public void doDelivery() {
		
	}

}

class XpressBee extends DeliveryPartner {
	@Override
	public void doDelivery() {
		
	}

}

class Ekart extends DeliveryPartner {

}
