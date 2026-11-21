package com.kodewala.Loop;

public class ReverseArray {

	public static void main(String[] args) {
//		int arr[] = {90,6,29,56,78,8};
//		int start =0;
//		int end  = arr.length-1;
//		while(start < end) {
//			int temp = arr[start];
//			arr[start] = arr[end];
//			arr[end] = temp;
//			start++;
//			end--;
//			
//		}
//		//print reverse array
//		for(int i=0; i<=arr.length-1; i++) {
//			System.out.println(arr[i] +" ");
//		}

		int matrix[][] = { { 2, 3, 4 }, 
							{ 5, 7,8  } };
		
		for (int j = 0; j < matrix[0].length; j++) {

			int sum = 0;

			for (int i = 0; i < matrix.length; i++) {
				sum += matrix[i][j];
			}

			System.out.println("Column " + j + " sum = " + sum);
		}

//		int target = 56;
//
//		for (int i = 0; i <= arr.length-1; i++) {
//
//		    if (arr[i] == target) {
//		        System.out.println("Element found at index: " + i);
//		        break;
//		    }
//		}

	}

}
