class FundTransfer{
	public static void main(String args[]){
	System.out.println("Starting main");
	
	//calling the method and passing the value
	boolean result = FundTransfer.doTransaction(10, "67548499", "56788789");
	
	System.out.println("Is transaction successful ? "+result);
	
	System.out.println("Ending main()");
	
	}
	
	static boolean doTransaction(int amountToBetxn, String senderAccNo, String recAccNo){
	System.out.println("Entered doTransaction");
	System.out.println("Input Received" +amountToBetxn+ " " +senderAccNo+ " " +recAccNo);
	System.out.println("exit doTransaction");
	return true;
	
	}

}