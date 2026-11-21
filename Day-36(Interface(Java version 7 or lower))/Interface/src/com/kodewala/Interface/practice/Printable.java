package com.kodewala.Interface.practice;

public interface Printable {
	void print();

}

interface Showable{
	void show();
}

interface Displayable extends Printable,Showable{
	
}