package Array;

public class Check_if_the_array_is_sorted {
	
	static boolean checkSortedArray(int arr[], int n) {
		for(int i=1;i<n;i++) {
			if(arr[i]<arr[i-1]) {  //Compares the current element arr[i] with the previous element arr[i - 1]. 2 <= 3 fails 

				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int arr[]= {2,34,36,45,53,56,88,100};
		int n = arr.length;
		System.out.println(checkSortedArray(arr,n));
	}

}

//Time Complexity: O(N)
