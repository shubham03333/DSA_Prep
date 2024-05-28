package com.sunbeam;

public class MaxWealth {

	public static void main(String[] args) {

		int[][] wealth = new int[][] { { 1, 2, 3 }, { 3, 12, 1 },{5,2,6} };

		int RichestCust = findRichest(wealth);
		System.out.println(RichestCust);

	}

	private static int findRichest(int[][] wealth) {

		int amt = wealth[0][0];
		for (int cust = 0; cust < wealth.length; cust++) {
			int sum = 0;
			for (int acc = 0; acc < wealth[cust].length; acc++) {
				sum += wealth[cust][acc];
			}

			if(sum>amt)
			amt = sum;

		}
		return amt;
	}

}
