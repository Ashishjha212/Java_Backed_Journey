package com.kodewala.Cloning;

public class Driver {

	public static void main(String[] args) throws CloneNotSupportedException {
		Address address = new Address("Bengaluru", "Karnataka");
		Employee emp = new Employee("Aj1234", "Ashish", address);
		Employee clonedEmp = (Employee) emp.clone();
		//emp.address.state="Mumbai";
		System.out.println(emp.address.state);
		System.out.println(clonedEmp.address.state);
		System.out.println(emp.address.state==clonedEmp.address.state);
		System.out.println(emp==clonedEmp);
		address=null;
		emp=null;
		clonedEmp=null;
	}

}
