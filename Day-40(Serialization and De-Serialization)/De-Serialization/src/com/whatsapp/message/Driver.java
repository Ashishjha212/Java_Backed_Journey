package com.whatsapp.message;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class Driver {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("C:\\Users\\lenovo\\Desktop\\Core Java\\Kodewala Acedemy\\Day-40\\Serialization\\message.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Message msg = (Message) ois.readObject();
		System.out.println("De Ser: " +msg.getMessage() + " and user id " +msg.getUserId());

	}

}
