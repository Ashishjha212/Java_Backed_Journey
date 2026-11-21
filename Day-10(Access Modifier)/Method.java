class Method{
	int n=11;
	public static void main(String args[]){
		Method m = new Method();
		m.isEven();
			
	}
	public  void isEven(){
		if(n%2==0){
		System.out.println("The number is even");
		}else{
		System.out.println("The number is odd");
		}
	}

}