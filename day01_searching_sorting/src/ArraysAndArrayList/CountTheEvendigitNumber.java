package ArraysAndArrayList;

public class CountTheEvendigitNumber {

	public static void main(String[] args) {
		int[] arr = { 12, 345, 2, 6, 7896,22,1000,-5,9};
//	        System.out.println(findNumbers(nums));

		int evenDigitNumbers = findNumContainingEvenDigits(arr);
		System.out.println("Number containing evendigits are : " + evenDigitNumbers);
		
		int oddDigitNumbers = findNumContainingOddDigits(arr);
		System.out.println("Number containing oddigits are : " + oddDigitNumbers);

		System.out.println(digits2(942474845));
	}

	private static int findNumContainingOddDigits(int[] arr) {
		int number;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			number = countDigits(arr[i]);
			if (number % 2 != 0) {
				count++;
			}
		}
		return count;
	}

	private static int findNumContainingEvenDigits(int[] arr) {

		int number;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			number = countDigits(arr[i]);
			if (number % 2 == 0) {
				count++;
			}
		}
		return count;
	}

	private static int countDigits(int i) {
		// 7896
		if (i < 0)
			i = i * -1;

		if (i == 0)
			return 1;

		int count = 0;
		while (i > 0) {
			count++;
			i = i / 10;
		}

		return count;
	}
	
	
	//shortcut to find number of digits in any number 
    static int digits2(int num) {
        if (num < 0) {
            num = num * -1;
        }
        return (int)(Math.log10(num)) + 1;
    }

}
