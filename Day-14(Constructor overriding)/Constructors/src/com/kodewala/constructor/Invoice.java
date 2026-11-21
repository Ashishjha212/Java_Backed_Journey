package com.kodewala.constructor;

public class Invoice {
	static int gst = 18;
	int amount;
	String itemName;
	String billingAddress;
	String customerId;
	String customerName;
	 Invoice(int _amount, String _itemName, String _billingAddress, String _customerId, String _customerName){
		 this.amount =_amount;
		 this.itemName=_itemName;
		 this.billingAddress=_billingAddress;
		 this.customerId=_customerId;
		 this.customerName=_customerName;
		 
	 }
	
	 }


