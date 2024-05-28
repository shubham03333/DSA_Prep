package ArraysAndArrayList;

public class MaxValueInArray {

	public static void main(String[] args) {
		
		int[] arr=new int[]{11,99,20,150,55,100};
		int maxVal=max(arr);
		
		System.out.println("max value in array is: "+maxVal);
		
	System.out.println(maxRange(arr,0,2));	
		

	}

	private static int max(int[] arr) {
		if(arr==null)
			return -1;
		int maxValue=arr[0];
		for(int i=1; i<arr.length;i++) {
			if(arr[i]>maxValue)
				maxValue=arr[i];		
		}
		return maxValue;
	}

	
	private static int maxRange(int[] arr, int start, int end) {
		if(start>end)
			return -1;
		int maxValue=arr[start];
		for(int i=start; i<=end;i++) {
			if(arr[i]>maxValue)
				maxValue=arr[i];		
		}
		return maxValue;
	}
}
