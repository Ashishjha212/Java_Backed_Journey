package com.kodewala.oops.inheritance;

public class NewManager extends NewEmployee {
	int teamSize;

	public NewManager(String name, int employeeId, double salary, int teamSize) {
		super(name, employeeId, salary);
		this.teamSize = teamSize;
	}

	public void conductMeeting() {
		System.out.println(name);
		System.out.println(employeeId);
		System.out.println(salary);
		System.out.println(teamSize);
		System.out.println("Manager is conducting a team meeting");
	}
	
	

}
