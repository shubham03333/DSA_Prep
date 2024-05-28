package com.sunbeam;
import java.util.*;

public class TimeComplexity {
	
	public static int factorial(int i) {
		
		int res=1;
		for(int j=1;j<=i;j++) {
			res=res*j;
		}
		return res;
	}
	
	public static void primeNumbers(int n) {
		int count=0;
		
		for(int num=0; num<=n;num++) {
			int i;
			for(i=2;i<num;i++) {
				if(num%i==0)
					break;
			}
			
			if(num==i) {

				System.out.print(num+",");
				count++;
			}
			}
		System.out.println();
		System.out.println("Number of prime numbers: "+count );
	}
	
	
	//converting given number into binary
	public static int BinaryNumber(int num) {
		
		while(num>0) {
			System.out.print(num%2);
			num=(num/2); 
		}
		
		return num;
	}
	
	public static void printTable(int num) {
		
		for(int i=1;i<=10;i++) {
			System.out.println(num*i);
		}
	}

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
//		System.out.println(factorial(5));
//		primeNumbers(200);
//		BinaryNumber(9);
		System.out.println("Enter the number: ");
		printTable(sc.nextInt());
		
	}

}
