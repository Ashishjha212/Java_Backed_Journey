package com.kodewala.exception;

public class Window {
	public Window() {
		System.out.println("Open Window");
	}

	public void close() {
		System.out.println("Close window");
	}
}

class Door {
	Door() {
		System.out.println("Open door");
	}

	public void close() {
		System.out.println("Close door");
	}
}

class UseRes {
	void m1() {
		Door dr = null;
		Window wn = null;
		try {
			dr = new Door();
			wn = new Window();
			int x=10/0;
			System.out.println("perform your task");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dr.close();
			wn.close();
		}
		
	}

	

	}



