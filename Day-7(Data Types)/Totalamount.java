class TotalAmount{
	static int price = 2000;
	public static void main(String args[]){
	TotalAmount totalAmount = new TotalAmount();
	System.out.println(totalAmount.price);
	TotalAmount.callingInstance();
	}
	
	public static void callingInstance(){
		System.out.println(TotalAmount.price);
	
	}
}