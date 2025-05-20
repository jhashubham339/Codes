package Array;

public class Rotate_Matrix_by_90_degrees {
	
	static void rotateMatrix(int arr[][]) {
		// 1. Transpose the matrix
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		//Reverse each row (using two pointer approach)
		for(int i=0;i<arr.length;i++) {
			int s = 0, e= arr.length-1;
			while(s<e) {
				// Swap matrix[i][s] with matrix[i][e]
				int temp = arr[i][s];
				arr[i][s] = arr[i][e];
				arr[i][e] = temp;
				s++;
				e--;
			}
		}
	}

	public static void main(String[] args) {
		int arr[][] = {
				{1,2,3},
				{4,5,6},
				{7,8,9},
		};
		rotateMatrix(arr);
		for(int i =0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}

// Time Complexity: O(n^2)
//Space Complexity: O(1)