package com.kodewala.Super;

public class ElectronicProduct extends Product{
	int warrenty;

	public ElectronicProduct(String _name, int _price, String _productId,int _warrenty) {
		super(_name, _price, _productId);
		this.warrenty=_warrenty;
	}
	
	

}
