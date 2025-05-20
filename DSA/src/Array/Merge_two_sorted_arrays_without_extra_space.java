package Array;

import java.util.Arrays;

public class Merge_two_sorted_arrays_without_extra_space {
	
	static void margeSortedArrays(int arr1[] ,int arr2[]) {
		int left = arr1.length-1;
		int right = 0;
		
		//left (starting from the last index of arr1) is within bounds (≥ 0), and
		//right (starting from the first index of arr2) is within bounds (< arr2.length).
		while(left>=0 && right<arr2.length) {
			if(arr1[left]>arr2[right]) {
				int temp = arr1[left];
				arr1[left] = arr2[right];
				arr2[right] = temp;
				left--;
				right++;
				}else {
					break;
				}
		}
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
	}

	public static void main(String[] args) {
		int arr1[] = {1, 4, 8, 10};
		int arr2[] = {2, 3, 9};
		margeSortedArrays(arr1,arr2);
	}

}
//Time Complexity: O(min(n, m)) + O(n*logn) + O(m*logm),
//Space Complexity: O(1)
