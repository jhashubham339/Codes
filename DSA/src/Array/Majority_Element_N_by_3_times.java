package Array;

import java.util.*;

public class Majority_Element_N_by_3_times {
	
	static void majorityElement(int arr[]) {
		List<Integer> ls = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			
			   if (ls.size() == 0 || ls.get(0) != arr[i]) {
	                int cnt = 0;
	                for (int j = 0; j < arr.length; j++) {
	                    // counting the frequency of v[i]
	                    if (arr[j] == arr[i]) {
	                        cnt++;
	                    }
	                }
	             // check if frquency is greater than n/3:
	                if (cnt > (arr.length / 3))
	                    ls.add(arr[i]);
	            }
			   if (ls.size() == 2) break;
		}
		System.out.println(ls);
	}

	public static void main(String[] args) {
		int arr[] ={11, 33, 33, 11, 33, 11};
		majorityElement(arr);
	}

}
//Time Complexity: O(N2)
//Space Complexity: O(1) 
