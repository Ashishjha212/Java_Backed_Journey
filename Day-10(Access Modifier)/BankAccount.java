class BankAccount{
	private double balance;
	
	
	public static void main(String args[]){
		BankAccount bankAccount = new BankAccount();
		bankAccount.method(7.5f);
		bankAccount.accountDetails("678549783");
		
		
		
	}
	protected void method(float interest){
		System.out.println("The interest rate is :" +interest);
		
	}
	public void accountDetails(String account){
		System.out.println("The accountDetails is :" +account);
	
	}
}