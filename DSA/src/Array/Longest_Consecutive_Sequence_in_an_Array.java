package Array;

import java.util.Arrays;

public class Longest_Consecutive_Sequence_in_an_Array {
	
	static void Longest_Consecutive(int arr[]) {
		Arrays.sort(arr);
        int longest = 1;
        int count = 1;  //You're already at the first element +1, you grow the sequence
        for (int i = 1; i < arr.length; i++) {
        	 // Skip duplicates
            if (arr[i] == arr[i - 1]) continue;

            if (arr[i] == arr[i - 1] + 1) {
                count++;
            } else {
                count = 1; // start new sequence
            }

            longest = Math.max(longest, count);
        }
        System.out.println(longest);
	}

	public static void main(String[] args) {
		int arr[]= {100, 200, 1, 2, 3, 4};
		Longest_Consecutive(arr);
	}

}
//Time Complexity: O(NlogN)