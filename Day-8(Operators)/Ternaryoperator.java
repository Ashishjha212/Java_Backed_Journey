class TernaryOperators{
	public static void main(String args[]){
	int minAge = 18;
	int maxAge=60;
	int userAge = Integer.parseInt(args[1]);
	String name = args[0];
	String message = minAge < userAge ? "Allowed" : "Not Allowed";
	System.out.println(message);
	
	}

}