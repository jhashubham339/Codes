package Array;

//public class Two_Sum {
//	
//	static void twoSum(int arr[],int target) {
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]+arr[j]==target) {
//					System.out.println("True");
//				}
//			}
//		}
//	}
//
//	public static void main(String[] args) {
//        int arr[] = {2, 6, 5, 8, 11};
//        int target = 14;
//        twoSum(arr,target);
//	}
//
//}
//Time Complexity: O(N2)

// two pointer approach
import java.util.Arrays;
public class Two_Sum {
	
	static void twoSum(int arr[],int target) {
		Arrays.sort(arr);
		int s = 0;
		int e = arr.length-1;
		while(s<e) {
			int sum= arr[s]+arr[e];
			if(sum == target) {
				System.out.println("Yes");
				
			}else if(sum<target) {
				s++;
			}else {
				e--;
			}
		}
		
	}

	public static void main(String[] args) {
        int arr[] = {2, 6, 5, 8, 11};
        int target = 14;
        twoSum(arr,target);
	}

}

//Time Complexity: O(N) + O(N*logN)
