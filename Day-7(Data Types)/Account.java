class Account{
	int balance = 2000; // instance variable
	static int intRate = 5; //static variable
	public static void main(String args[]){
	
	Account acc = new Account(); // Object creation
	
	System.out.println("Balance is :" +acc.balance); // calling by object
	System.out.println("Intrate is : " +intRate); // calling by class
	
	}
}