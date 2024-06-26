package ArraysAndArrayList;

import java.util.Arrays;

public class ReverseTheArray {

	public static void main(String[] args) {
		
		int[] arr=new int[]{1,2,3,4,5,6};
		
		System.out.println("before swapping: ");
		System.out.println(Arrays.toString(arr));
		System.out.println("after swapping: ");
	  reverse(arr);

	}

	private static void reverse(int[] arr) {
			
		int start=0;
		int end=arr.length-1;
		for(int i=start;i<=end;i++) {
			swap(arr,start,end);
			start++;
			end--;
		}
		System.out.println(Arrays.toString(arr));
		
	}

	private static void swap(int [] arr,int start, int end) {
		int temp= arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
	}

}
