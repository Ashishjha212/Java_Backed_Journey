class AmazonOrder{
	public static void main(String args[]){
		System.out.println("Same day delivery if you are Amazon user");
		int amount = 2000;
		int txnAmount = Integer.parseInt(args[0]);
		System.out.println("3% transaction charge for amount more than 2000 :" +(txnAmount > amount));
		
	}
}