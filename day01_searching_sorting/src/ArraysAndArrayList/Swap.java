package ArraysAndArrayList;

import java.util.Arrays;

public class Swap {

	public static void main(String[] args) {
		
		int[] arr=new int[]{11,22,33,44,55};
		int i=1;
		int j=4;
		System.out.print("before swapping");
		System.out.println(Arrays.toString(arr));
		System.out.println("After swapping");
//		System.out.println(Arrays.toString(swap(arr,i,j)));
		
		for(int num : swap(arr,i,j)) {
			System.out.print(num+" ");
		}

	}

	private static int [] swap(int[] arr, int i, int j) {
		
		int temp;
		temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		return arr;

	}

}
