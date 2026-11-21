package com.whatsapp.message;

import java.io.IOException;

public class Driver {

	public static void main(String[] args) throws IOException {
		MessageSerialization messageSerialization  = new MessageSerialization();
		Message message = new Message("MSG1", "Mujhe message kyu kar rahe ho","Aj12345");
		messageSerialization.serializeMsg(message);

	}

}
