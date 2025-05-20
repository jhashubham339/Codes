package Array;

import java.util.*;

public class Rearrange_Array_Elements_by_Sign {
	
	static void rearrange_Array(int arr[]) {
		List<Integer> pos = new ArrayList<>();
		List<Integer> neg = new ArrayList<>();
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				pos.add(arr[i]);
			}else {
				neg.add(arr[i]);
			}
		}
        // Separate positives and negatives
		for(int i=0;i<pos.size() && i<neg.size(); i++) {
			arr[2*i] = pos.get(i); // Even index: positive
			arr[2*i+1] = neg.get(i); // Odd index: negative
		}
		System.out.println(Arrays.toString(arr) + " ");
	}

	public static void main(String[] args) {
		int arr[]= {3, 1, -2, -5, 2, -4};
		rearrange_Array(arr);
	}

}

//Time Complexity: O(N+N/2)
//SC =  O(N) 
