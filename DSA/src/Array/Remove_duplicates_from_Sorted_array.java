package Array;

//import java.util.HashSet;
//import java.util.Set;

//Brute Force Approach
//public class Remove_duplicates_from_Sorted_array {
//	
//	static void removeDuplicate(int arr[],int n) {
//			Set<Integer> set = new HashSet<>();
//			for(int i=0;i<n;i++) {
//			 set.add(arr[i]);
//		  }
//			  // Print the unique values
//	        for (int value : set) {
//	            System.out.print(value + " ");
//	        }
//			//Return total number of unique elements
//	         System.out.println("\nTotal number of unique elements are : "+set.size());
//	         //return set.size();
//	}
//
//	public static void main(String[] args) {
//		int arr[]= {1,1,2,2,3,3,3,4};
//		int n = arr.length;
//		removeDuplicate(arr,n);
//	}
//}

//Time complexity : O(n*log(n))
//Space Complexity: O(n) 

//Optimal Approach
public class Remove_duplicates_from_Sorted_array {
	
	static void removeDuplicate(int arr[],int n) {
		int i=0;
		for(int j=0;j<n;j++) {
			if(arr[j]!=arr[i]) {
				arr[i+1]=arr[j];
				i++;
			}
		}
		System.out.println(i+1);
	}

	public static void main(String[] args) {
		int arr[]= {1,1,2,2,3,3,3,4};
		int n = arr.length;
		removeDuplicate(arr,n);
	}
}

//Time Complexity: O(n) 


