//Print factorial of n numbers

package Recursion;

public class Factorial {
	
	static int fact(int n) {
		if(n==0)
			return 1;
		return n*fact(n-1);
	}

	public static void main(String[] args) {
		int result = fact(5);
		System.out.println(result);
	}
}

// Output = 120
//TC = O(n)
//GFG : https://www.geeksforgeeks.org/problems/find-all-factorial-numbers-less-than-or-equal-to-n3548/0?problemType=functional&difficulty%255B%255D=-1&page=1&query=problemTypefunctionaldifficulty%255B%255D-1page1