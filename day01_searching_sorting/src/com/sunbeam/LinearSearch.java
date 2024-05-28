package com.sunbeam;

public class LinearSearch {

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 2, 3, 4, 5, 6 };
		int key = 10;
		int index = linearSearch(arr, key);
//		System.out.println("element is found at index: "+index);

		// String search
		String str = "shubham";
		char target = 'm';
		int i = linearStrSearch(str, target);
//		System.out.println(target+" is found at index "+i);

		// Linear Search in range
		int start = 1;
		int end = 5;
		int foundAt = linearSearchInRange(arr, key, start, end);
		System.out.println("element in range is found at index: " + foundAt);

	}

	private static int linearSearchInRange(int[] arr, int key, int start, int end) {
		
		if(start > end)
			return -1;
		for (int i = start; i <= end; i++) {
			if (key == arr[i])
				return i;
		}
		return -1;
	}

	private static int linearStrSearch(String str, char target) {
		char[] chArr = str.toCharArray();

		for (int i = 0; i < chArr.length; i++) {

			if (target == chArr[i])
				return i;
		}
		return -1;

	}

	private static int linearSearch(int[] arr, int key) {
		int index = 0;
		if (arr.length == 0)
			return -1;
		for (int i = 0; i < arr.length; i++) {
			if (key == arr[i]) {
				index = i;
				return index;
			}
		}
		return -1;
	}
}
