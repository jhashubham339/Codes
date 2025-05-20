package Array;

public class Kadanes_Algorithm_maximum_subarray_sum {
	
	static void maximumSubarray(int arr[]) {
		long maxsum = Long.MIN_VALUE;
		long currentsum =0;
		for(int i=0;i<arr.length;i++) {
			currentsum = currentsum + arr[i];
			if(currentsum>maxsum) {
				maxsum = currentsum;
			}
			if(currentsum<0) {
				currentsum =0;
			}
		}
		System.out.println(maxsum);
	}

	public static void main(String[] args) {
		int arr[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
		maximumSubarray(arr);
	}

}

//Time Complexity: O(N)