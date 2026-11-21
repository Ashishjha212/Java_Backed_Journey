package com.kodewala.loop;

public class Percentage {

	public static void main(String[] args) {
		float mathMarks = Integer.parseInt(args[0]);
		System.out.println("Math mark is:"+mathMarks);
		float scienceMarks = Integer.parseInt(args[1]);
		System.out.println("Math mark is:"+scienceMarks);
		float englishMarks = Integer.parseInt(args[2]);
		System.out.println("Math mark is:"+englishMarks);
		float hindiMarks = Integer.parseInt(args[3]);
		System.out.println("Math mark is:"+hindiMarks);
		float computerMarks = Integer.parseInt(args[4]);
		System.out.println("Math mark is:"+computerMarks);
		
		float average =(mathMarks+scienceMarks+englishMarks+computerMarks+hindiMarks)/5;
		System.out.println("Average is:"+average);
		
		
		
		

	}

}
