package com.kodewala.StackOverFlow;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;

public class Driver1 {

	public static void main(String[] args) {
		String fileName = "text.xls";
		
		try(FileOutputStream fis = new FileOutputStream(new File(fileName))) //try with resources
		{
			// creating connection with file System
			String name = "Ash";
			name.charAt(0); 
			

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//fis will be closed automatically

	}
}
