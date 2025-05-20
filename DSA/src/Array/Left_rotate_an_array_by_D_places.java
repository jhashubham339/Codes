package Array;

import java.util.Arrays;

public class Left_rotate_an_array_by_D_places {
    // Function to reverse elements in the array from index start to end
	static void reverseArray(int arr[],int s, int e) {
		while(s<e) {
			int temp = arr[s];
			arr[s] = arr[e];
			arr[e] = temp;
			s++;
			e--;
		}
	}
	// Function to left rotate the array by d positions
	static void rotate(int arr[],int d) {
		int n = arr.length;
		d=d%n; // In case d > n
		if(d==0) 
			return; // No rotation needed
		reverseArray(arr,0,d-1);   // Reverse first d elements
		reverseArray(arr,d,n-1);   // Reverse remaining n-d elements
		reverseArray(arr,0,n-1);   // Reverse the entire array
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,8,9,11};
		int d=5;
		rotate(arr,d);
		System.out.println(Arrays.toString(arr));
	}

}
