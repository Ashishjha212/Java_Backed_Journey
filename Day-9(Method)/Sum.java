class Sum{
	public static void main(String args[]){
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			int result = Sum.sumNum(num1,num2);
			System.out.println("The sum is :" +result);
	}
	
	static int sumNum(int num1, int num2){
		
	return num1+num2;
	
	}

}