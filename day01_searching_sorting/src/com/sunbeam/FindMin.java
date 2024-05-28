package com.sunbeam;

public class FindMin {

	public static void main(String[] args) {
		int[] arr = new int[] { 10, 12, 31, -2, 5, -60 };
		
		int min =findMin(arr);
		System.out.println("min value is : "+min);

	}
	
	public static int findMin(int[] arr) {
		int minVal=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<minVal) {
				minVal=arr[i];
			}
		}
		return minVal;
	}

}
