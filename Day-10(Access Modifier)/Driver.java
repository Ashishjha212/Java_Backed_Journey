class Driver{
	public static void main(String args[]){
		System.out.println("main() starts");
		//object creation
		OrderMgmt objMgmt = new OrderMgmt();
		objMgmt.placeOrder("iphone 18");
		//calling method of another class OrderMgmt
		objMgmt.placeOrder("Realme");
		System.out.println("main() ends");
		
	
	}
}