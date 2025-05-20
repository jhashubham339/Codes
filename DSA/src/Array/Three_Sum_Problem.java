package Array;

import java.util.*;

public class Three_Sum_Problem {
	
	static void findTriplets(int arr[]) {
		List<List<Integer>> ans = new ArrayList<>();
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
		      //remove duplicates:
            if (i != 0 && arr[i] == arr[i - 1]) continue;
            
            //moving 2 pointers:
            int j = i + 1;
            int k = arr.length - 1;
            
            while(j<k) {
            	int sum = arr[i] + arr[j] + arr[k];
            	if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                }else {
                    // Found a valid triplet
                    ans.add(Arrays.asList(arr[i], arr[j], arr[k]));
                	  j++;
                      k--;
                      //skip the duplicates:
                      while (j < k && arr[j] == arr[j - 1]) j++;
                      while (j < k && arr[k] == arr[k + 1]) k--;
                  }
            }
		}
		System.out.println(ans);
	}

	public static void main(String[] args) {
		int arr[] = {-1, 0, 1, 2, -1, -4};
		findTriplets(arr);
	}

}
