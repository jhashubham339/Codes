package Array;

//public class Missing_number_in_an_array {
//	
//	static void missingNumber(int arr[],int n) {
//		for(int i=1;i<n;i++) {
//			int flag =0;
//			for(int j =0;j<n-1;j++) {
//				if (arr[j] == i) {
//					flag =1;
//					break;
//				}
//			}
//			
//			if(flag==0) {
//				System.out.println("Missing number = "+ i);
//			}
//		}
//	}
//
//	public static void main(String[] args) {
//		int arr[]= {1, 2, 4, 5};
//		int n=5;
//		missingNumber(arr,n);
//
//	}
//
//}

// TC = O(n^2)

public class Missing_number_in_an_array {
	
	static void missingNumber(int arr[],int n) {
		int sum = (n*(n+1))/2;
		int s2=0;
		for(int i =0;i<n-1;i++) {
			s2 = s2+arr[i];
		}
		int differance = sum -s2;
		System.out.println(differance);
	}

	public static void main(String[] args) {
		int arr[]= {1, 2, 4, 5};
		int n=5;
		missingNumber(arr,n);

	}

}

//Time Complexity: O(N)

