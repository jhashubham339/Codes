package Array;

//public class Number_that_appears_once {
//	
//	static void numberOnce(int arr[]) {
//		for(int i=0;i<arr.length;i++) {
//			int num = arr[i];
//			int count =0;
//			for(int j=0;j<arr.length;j++) {
//				if(arr[j]==num) {
//					count++;
//				}
//			}
//			if(count ==1) {
//				System.out.println(num);
//			}
//		}
//	}
//
//	public static void main(String[] args) {
//		int arr[]= {4, 1, 2, 1, 2};
//		numberOnce(arr);
//	}
//}

//Time Complexity: O(N2)
//XOR of all elements = 4^1^2^1^2
//= 4 ^ (1^1) ^ (2^2)
//= 4 ^ 0 ^ 0 = 4^0 = 4
public class Number_that_appears_once {
	
	static void numberOnce(int arr[]) {
		int xorr = 0;
		for(int i=0;i<arr.length;i++) {
			xorr = xorr ^ arr[i];
		}
		System.out.println(xorr);
	}

	public static void main(String[] args) {
		int arr[]= {4, 1, 2, 1, 2};
		numberOnce(arr);
	}
}