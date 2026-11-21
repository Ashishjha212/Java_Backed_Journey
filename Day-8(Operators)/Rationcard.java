class RationCard_Apply{
	public static void main(String args[]){
	int annualIncome = 50000;
	System.out.println("For Ration card annual income should more than 50000");
	int userIncome = Integer.parseInt(args[0]);
	System.out.println("Ration card applicable :" +(userIncome < annualIncome));
	
	}
}