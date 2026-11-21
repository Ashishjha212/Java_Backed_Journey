package com.kodewala.string;

public class Driver {

	public static void main(String[] args) {
		String s1 = "This "     +  "is from "   + "Kodewala Academy Bangalore";
		System.out.println(s1);
		
		String s2="Kodewala";//scp
		String s3="Academy";//scp
		String s4=s2+s3;//scp + Heap but s2 and s3 is already there in scp so it refer only
		String sx =s2 +" " +s3;
		String str = sx.intern();
		System.out.println(sx);//Heap
		System.out.println(s4);
		
		String s5="Kodewala Academy";
		System.out.println(s5==s4);
		System.out.println(s5 == s4.intern());
		System.out.println(s5 == str);//str will be copied to SCP from heap.
		System.out.println(s5==sx);
		
		String s6="Ashish";
		String s7 = new String("Ashish");
		System.out.println(s6==s7.intern());

	}

}
