package Sorting;

public class BubbleSort {
	
	 static void bubbleSort(int arr[],int n) {
		for(int i=0;i<n-1;i++) {       // number of passes
			for(int j=0;j<n-i-1;j++) { //as the last elements in the array are already 
				if(arr[j]>arr[j+1]) {
					//swap
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}		
		}
		//print
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+ " ");
		}
	}

	public static void main(String[] args) {
		int arr[]= {9,33,20,24,46,52};
		int n = arr.length;
		bubbleSort(arr,n);
	}
}

//Time Complexity: O(N^2)
//Auxiliary Space: O(1)


