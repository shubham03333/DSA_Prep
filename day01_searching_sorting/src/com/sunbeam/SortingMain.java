package com.sunbeam;

import java.util.Arrays;
import java.util.Iterator;

public class SortingMain {


	public static void selectionSort(int[] a) {

		int temp;
		// select the i th element
		for (int i = 0; i < a.length - 1; i++) {

			// compare the selected element with all other elements
			for (int j = i + 1; j < a.length; j++) {
				// if the i th element is greater then the comparing element swap the elements
				if (a[i] > a[j]) { // to make it descending sort just change the (a[i]<a[j])
					temp = a[i]; // swapping logic
					a[i] = a[j];
					a[j] = temp;
				}

			}
		}
		System.out.println(Arrays.toString(a));
	}

	public static void bubbleSort(int[] a) {
		int temp, count = 0;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1; j++) { // [5, 4, 2, 6, 3, 7, 1]
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
				count++;
			}
		}
		System.out.println("number of iterations: " + count);
		System.out.println(Arrays.toString(a));

	}

	public static void bubbleSortImporoved(int[] a) {
		int temp, count = 0;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) { // change for(int j=0;j<a.length-1-i;j++)
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
				count++;
			}

		}
		System.out.println("number of iterations: " + count);
		System.out.println(Arrays.toString(a));

	}

	public static void bubbleSortFurtherImproved(int[] a) {

		int temp, count = 0;
		boolean flag = false;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {

				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j] = temp;
					flag = true;

				}
				count++;

			}
			if (flag == false)
				break;
		}
		System.out.println(Arrays.toString(a));
		System.out.println("number of iterations: " + count);

	}

	public static void main(String[] args) {

//		int[] arr = { 5, 4, 2, 6, 3, 7, 1 };

		// for testing best case sccen already sorted array
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println("printing array using for loop: ");

		System.out.println("\n Array before sorting: \n" + Arrays.toString(arr));

		System.out.println("Array After sorting:");
//		selectionSort(arr);//time complexity= o(n)
//		bubbleSort(arr);
//		bubbleSortImporoved(arr);

		bubbleSortFurtherImproved(arr);
	}

}
