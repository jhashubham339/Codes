package Array;

public class Count_subarrays_with_given_sum {
	
	static void Count_subarrays(int arr[],int k) {
		int count =0;
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=i;j<arr.length;j++) {
				sum = sum+arr[j];
				
				if(sum==k) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		int arr[] =	{3, 1, 2, 4};
		int k=6;
		Count_subarrays(arr,k);
	}

}

//TS = O(N^2)
