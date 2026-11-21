class ZeptoOrder{
	public static void main(String args[]){
		System.out.println("Free delivery for oder value greater than 500");
		int amount = Integer.parseInt(args[0]);
		if(amount > 500){
			System.out.println("Free delivery");
		}else{
			System.out.println("Not free delivery");
		}
		
	}
}