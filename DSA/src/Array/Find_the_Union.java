package Array;

import java.util.*;

public class Find_the_Union {
	

	static List<Integer> findUnion(int arr1[],int arr2[]){
		Set<Integer> unionSet = new HashSet<>();
		for(int num : arr1)
			unionSet.add(num);
		for(int num : arr2)
			unionSet.add(num);
		
		List<Integer> union = new ArrayList<>(unionSet);
		return union;
	}

	public static void main(String[] args) {
		int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int arr2[] = {2, 3, 4, 4, 5, 11, 12};
		List<Integer> union = findUnion(arr1,arr2);
		for(int val : union)
			System.out.print(val + " ");
	}

}

//TC = With sorting: O((n + m) log(n + m))


