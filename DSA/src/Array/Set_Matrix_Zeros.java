package Array;

public class Set_Matrix_Zeros {
	
	static void setMatrix(int arr[][],int n,int m) {
		int row[] = new int[n]; // row array
		int col[] = new int[m]; // column array
		
		 // Traverse the matrix:
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(arr[i][j]==0) {
					row[i] = 1;
					col[j] = 1;
				}
			}
		}
		
		// Step 2: Set the marked rows and columns to zero
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(row[i] ==1 || col[j] ==1) {
					arr[i][j] =0;
				}
			}
		}
	}

	public static void main(String[] args) {
		int arr[][]= {
	            {1, 1, 1},
	            {1, 0, 1},
	            {1, 1, 1}
	        };
		setMatrix(arr,3,3);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
	}

}

//Time Complexity: O(2*(N*M))
//Space Complexity: O(N) + O(M)

