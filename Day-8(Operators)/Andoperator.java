class AndOperators{
	public static void main(String args[]){
	int minAge = 18;
	int maxAge=60;
	int userAge = Integer.parseInt(args[1]);
	String name = args[0];
	System.out.println("condition 1 :" +(userAge > minAge));
	System.out.println("condition 2:" +(userAge < maxAge ));
	System.out.println("Eligible or not:" +(userAge > minAge) && (userAge < maxAge));
	
	
	}

}