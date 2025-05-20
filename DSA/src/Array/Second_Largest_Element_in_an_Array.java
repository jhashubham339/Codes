package Array;
//Brute Force Approach
//public class Second_Largest_Element_in_an_Array {
//	
//	static void secondLargest(int arr[],int n) {
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
////		System.out.println(n-2);       //index
////		System.out.println(arr[n-2]);  //element
//		
//		int largest = arr[n-1];
//		int secondLargest = -1; // Initialize to an invalid value in case no second largest is found
//		
//		for(int i=n-2;i>=0;i--) {
//			if(arr[i]<largest) {
//				 secondLargest = arr[i];
//				 System.out.print(secondLargest + " ");
//				 break;
//			}
//		}
//		 if (secondLargest == -1) {
//	            System.out.println("No second largest element exists as all elements are the same.");
//	        }
//	}
//
//	public static void main(String[] args) {
//		int arr[]= {12,34,55,67,98,98,97,54,5};
//		int n = arr.length;
//		secondLargest(arr,n);
//	}
//}

//Time Complexity: O(NlogN)

//Better Approach
public class Second_Largest_Element_in_an_Array {
	
	static void secondLargest(int arr[],int n) {
		int largest=arr[0];
		for(int i=0;i<n;i++) {
			if(arr[i]>largest) {
				largest = arr[i];
			}
		}
		int secondLargest = -1; //-1 assumes that all elements in the array are non-negative
		for(int i=0;i<n;i++) {
			if(arr[i]>secondLargest && arr[i]!=largest) {
				secondLargest = arr[i];
			}
		}
		System.out.println(secondLargest);
		
	}

	public static void main(String[] args) {
		int arr[]= {12,34,55,67,98,98,97,54,5};	
		int n = arr.length;
		secondLargest(arr,n);
	}
}
//Time Complexity: O(2N)
