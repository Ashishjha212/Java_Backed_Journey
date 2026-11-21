package com.kodewala.ShallowCloning;

public class Driver {
	Address address;
	Employee emp1;
	Employee clonedEmp;

	public void doSomething() throws CloneNotSupportedException {

		address = new Address("Btm layout", "29th main road", "Bangalore");
		emp1 = new Employee("Ashish", "Aj123", address);
		clonedEmp = (Employee) emp1.clone();
		emp1.address.city = "Hyd";
		System.out.println(emp1.address.city);
		System.out.println(clonedEmp.address.city);
		
		emp1=null;
		address=null;
	}
	public static void main(String[] args) throws CloneNotSupportedException
	   {
		
		   	Address address = new Address("16th main", "27th cross ", "Bangalore");
		   	
		   	Employee emp1 = new Employee("Ashish", "AJ893", address);
		   	
		   	Employee clonedEmp = (Employee) emp1.clone(); // shallow copy ie only one level (only Employee) 
		   
		   	emp1.address.city = "Hyd";
		   	System.out.println(emp1.address.city);
		   	System.out.println(clonedEmp.address.city);

	}

}
