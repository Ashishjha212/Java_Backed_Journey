class NewAccount{
	static int price = 50;
	int price1 = 40;
	public static void main(String args[]){
		NewAccount newAccount = new NewAccount();
	int amount = 200;
	int amountDebit = 20;
	System.out.println("The total amount is : " +amount);
	System.out.println("The amountDebit is : " +amountDebit);
	System.out.println("The price is :" +newAccount.price);
	System.out.println(newAccount.price1);
	newAccount.doSomething();
	
	}
	
	public  void doSomething(){
		System.out.println("This is dosomething method");
		
	}
	
	

}