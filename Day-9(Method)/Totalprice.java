class Total_Price{
	public static void main(String args[]){
		int toyPrice  = 120;
		int clothPrice = 500;
		int shoesPrice = 600;
		int watchPrice = 2000;
		Total_Price.calculatePrice(120,500,600,2000);
		System.out.println("The total price of items in shopping cart :" +toyPrice+ " " +clothPrice+ " " +shoesPrice + " " +watchPrice);
		int totalPrice = (toyPrice + clothPrice + shoesPrice + watchPrice);
		System.out.println(totalPrice);
		
	}
	
	public static int calculatePrice(int toyPrice,int clothPrice, int shoesPrice,int  watchPrice ){
	
		return toyPrice+clothPrice+shoesPrice+watchPrice;
		
	}
}