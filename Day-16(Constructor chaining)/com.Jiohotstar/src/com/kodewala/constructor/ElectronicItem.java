package com.kodewala.constructor;

public class ElectronicItem extends Item {
	int warrenty;
	public ElectronicItem(String _name, int _price, String _itemId, int _warrenty ) {
		super(_name, _price, _itemId); //init the default fields
		this.warrenty = _warrenty;
	}

}
