package Array;

import java.util.Arrays;

public class Move_Zeros_to_end {
	
	static void moveZeros(int arr[], int n) {
		int j = -1; //zeroPos 
		// Find the first zero's index
		for(int i=0;i<n;i++) {
			if(arr[i]==0) {
				j=i;
				break;
			}
		}
        // If there are no zeros, return as is
        if (j == -1)
        	return;       
        // Swap non-zero elements with the position at zeroPos
        for(int i=j+1;i<n;i++) {
        	if(arr[i]!=0) {
        		//swap
        		int temp =arr[i];
        		arr[i]=arr[j];
        		arr[j]=temp;
        		j++;
        	}
        }
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,8,9,11};
		int n=arr.length;
		moveZeros(arr,n);
		System.out.println(Arrays.toString(arr));
		
	}

}
