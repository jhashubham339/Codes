package Array;

//Brute Force Approach
//public class Largest_Element_In_an_Array {
//	
//	static void largestElement(int arr[], int n) {
//		for(int i=0;i<n-1;i++) {
//			for(int j=0;j<n-i-1;j++) {
//				if(arr[j]>arr[j+1]) {
//					//swap
//					int temp = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1] = temp;
//				}
//			}
//		}
//		System.out.println(n-1);     // print the index
//		System.out.println(arr[n-1]);// print the element
//	}
//
//	public static void main(String[] args) {
//		int arr[]= {32,100,23,89,96,45};
//		int n=arr.length;
//		largestElement(arr,n);
//	}
//}

//Time complexity: O(N^2)


//Recursive Approach
public class Largest_Element_In_an_Array {
	
	static void largestElement(int arr[], int n) {
		int largest = arr[0];    //assume 1st index is largest
		for(int i=0;i<n;i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}
		}
		//print 
		System.out.println(largest);
	}

	public static void main(String[] args) {
		int arr[]= {32,100,23,89,96,45};
		int n=arr.length;
		largestElement(arr,n);
	}
}

//Time Complexity: O(N)
//Space Complexity: O(1)