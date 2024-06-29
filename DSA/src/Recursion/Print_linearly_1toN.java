//Print Linearly 1 to N.

package Recursion;

public class Print_linearly_1toN {

	static void fun(int i , int n) {
		if(i>n)
			return;
		System.out.print(i +" ");
		fun(i+1,n);
	}

	public static void main(String[] args) {
		fun(1,10);
	}
}
//Output : 1 2 3 4 5 6 7 8 9 10 
// TC : O(n)
//GFG : https://www.geeksforgeeks.org/problems/print-1-to-n-without-using-loops-1587115620/1