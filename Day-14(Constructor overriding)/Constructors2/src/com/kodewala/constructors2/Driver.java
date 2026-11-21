package com.kodewala.constructors2;
class Invoice{
	static int gst=18;
	int amount;
	String itemName;
	String billingAddress;
	String customerId;
	String customerName;
	
	public Invoice(int _amount, String _itemName, String _billingAddress, String _customerId, String _customerName) {

		this.amount = _amount;
		this.itemName = _itemName;
		this.billingAddress = _billingAddress;
		this.customerId = _customerId;
		this.customerName = _customerName;
	}
	
	
}

public class Driver {
	public static void main(String[] args) {
		Invoice invoice = new Invoice(50000, "samsung", "Btm", "cs876", "Rohit");
		Invoice invoice1 = new Invoice(5000, "Motorola", "Btm 2nd stage", "cs866", "Raj");
		
		System.out.println("First invoice :"+invoice.amount+ " , "+invoice.billingAddress+ " , " +invoice.gst);
		System.out.println("Second invoice:"+invoice1.amount+ " , "+invoice1.billingAddress+ " , " +Invoice.gst);
		
	}

}
