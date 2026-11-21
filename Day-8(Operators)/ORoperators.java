class OROperators{
	public static void main(String args[]){
	int maxAge = 60;
	int minAge = 18;
	int userAge = Integer.parseInt(args[0]);
	String name = args[1];
	System.out.println("Can give the vote :" +((userAge > minAge) || ( userAge < maxAge)));
	}
}