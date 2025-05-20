package Sorting;

public class SelectionSort {
	
	static void selectionSort(int arr[], int n) {
		for(int i=0;i<=n-1;i++) {    
			int min=i;               //observe the first index as the minimum
			for(int j=i+1;j<n;j++) {   // inner loop should start from i+1
				if(arr[j]<arr[min]) {
					min=j;
				}
			 }	
			//swap
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] + " ");
		}
		
	}

	public static void main(String[] args) {
		int arr[]= {13,46,24,52,20,19,99};
		int n= arr.length;
		selectionSort(arr,n);
	}

}

// Time complexity: O(N^2)
