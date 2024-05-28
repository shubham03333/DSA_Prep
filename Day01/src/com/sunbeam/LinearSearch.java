package com.sunbeam;

import java.util.Arrays;

public class LinearSearch {

	
	public static int linearSearchMethod(int a[],int key) {
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==key)
				return i;
		}
		
		return -1;
		
	}
	
	
	public static void main(String[] args) {
		
		//array=[88,33,66,99,11,77,22,55,44]
		int a[]= {88,33,66,99,11,77,22,55,44};
//		System.out.println(Arrays.toString(a));
		
//		for(int i=0; i<a.length;i++) {
//			System.out.print(a[i]+" ");
//		}

		int element=linearSearchMethod(a,88);
		if(element==-1) {
			System.out.println("key not found");
		}
		else
		System.out.println("key found at "+element );
	}

}
