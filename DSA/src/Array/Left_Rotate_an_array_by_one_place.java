package Array;

//Optimal Approach
public class Left_Rotate_an_array_by_one_place {
	
	static void LeftRotate(int arr[],int n) {
		int temp=arr[0];
		for(int i=1;i<n;i++) {
			arr[i-1]=arr[i];
		}
		 arr[n-1]=temp;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,6,8,9};
		int n = arr.length;
		LeftRotate(arr,n);
	}

}

//Time Complexity: O(N)
//Space Complexity: O(1)


//Initial array: {1, 2, 3, 4, 6, 8, 9}
//
//n = 7 (since the array has 7 elements).
//The goal of this loop is to shift every element of the array one position to the left.
//
//How it works:
//
//For each iteration of the loop, the element at index i is replaced with the element at index i + 1.
//Step-by-step breakdown of the loop:
//
//Iteration 1: (i = 0)
//arr[0] = arr[1]; → arr[0] becomes 2
//New array: {2, 2, 3, 4, 6, 8, 9}
//Iteration 2: (i = 1)
//arr[1] = arr[2]; → arr[1] becomes 3
//New array: {2, 3, 3, 4, 6, 8, 9}
//Iteration 3: (i = 2)
//arr[2] = arr[3]; → arr[2] becomes 4
//New array: {2, 3, 4, 4, 6, 8, 9}
//Iteration 4: (i = 3)
//arr[3] = arr[4]; → arr[3] becomes 6
//New array: {2, 3, 4, 6, 6, 8, 9}
//Iteration 5: (i = 4)
//arr[4] = arr[5]; → arr[4] becomes 8
//New array: {2, 3, 4, 6, 8, 8, 9}
//Iteration 6: (i = 5)
//arr[5] = arr[6]; → arr[5] becomes 9
//New array: {2, 3, 4, 6, 8, 9, 9}
//After the loop ends, we’ve shifted all elements one position to the left. However, the last position now contains a duplicate of the last element (9 in this case).