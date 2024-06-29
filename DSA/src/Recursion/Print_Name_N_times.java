//Print Name N times.

package Recursion;

public class Print_Name_N_times {
	
	static void fun(int i , int n) {
		if(i>n)
			return;
		System.out.println("Shubham");
		fun(i+1,n);
	}

	public static void main(String[] args) {
		fun(1,5);
	}
}
//Output print Name 5 times.
//TC = O(n)
//GFG: https://www.geeksforgeeks.org/problems/print-gfg-n-times/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=print-gfg-n-times