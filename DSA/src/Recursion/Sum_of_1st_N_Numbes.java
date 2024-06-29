//Print sum of first N numbers

package Recursion;

public class Sum_of_1st_N_Numbes {
	
	static int sum(int N) {
		if(N==0)
			return 0;
		return N+sum(N-1);
		
	}

	public static void main(String[] args) {
		int result = sum(5);
		System.out.println(result);
	}
}

//Output : 15  | 5+(5-1)+(4-1)+(3-1)+(2-1)+(1-1) = 15
//TC = O(n);
//GFG : https://www.geeksforgeeks.org/problems/sum-of-first-n-terms5843/1