package com.kodewala.MarkerInterface;

public class DataCleaner implements Cleanable {
	public void clean(Object obj) {
		if(obj instanceof Cleanable) {
			System.out.println("Allowed to perform data cleaning");
		}else {
			System.err.println("Not Allowed");
		}
	}

}
