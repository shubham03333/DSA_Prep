package com.sunbeam;

import java.util.Arrays;

public class SearchingIn2dArray {

	public static void main(String[] args) {

		int[][] arr = { { 1, 2, 30 }, { 4, -50, 6 }, { 7, -8, 9 } };

		int target = 8;
		int[] index = searchIn2d(arr, target);
//		System.out.println(Arrays.toString(index));
		
		int min=findMinValIn2d(arr);
		System.out.println("min value in 2d array is : "+min);
		
		int max=findMaxValIn2d(arr);
		System.out.println("min value in 2d array is : "+max);

	}

	private static int findMaxValIn2d(int[][] arr) {
		int maxVal=arr[0][0];
		
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
				if(arr[row][col]>maxVal)
					maxVal=arr[row][col];
			}
		}
		return maxVal;
	}

	private static int findMinValIn2d(int[][] arr) {
		int minVal=arr[0][0];
		
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
				if(arr[row][col]<minVal)
					minVal=arr[row][col];
			}
		}
		return minVal;
	}

	private static int[] searchIn2d(int[][] arr, int target) {

		for (int row = 0; row < arr.length; row++) {

			for (int col = 0; col < arr[row].length; col++) {
				if (arr[row][col]==target ) 
					return new int[] {row,col};
			}

		}
		
		return new int[] {-1,-1};

	}
}
