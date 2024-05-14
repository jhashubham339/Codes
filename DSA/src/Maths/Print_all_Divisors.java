//6.Print all Divisors. Ex: N =12, Output: [1, 2, 3, 4, 6, 12]

package Maths;

public class Print_all_Divisors {

	public static void main(String[] args) {
		int n=12;
	     for(int i=1;i<=n;i++){
	         if(n%i==0){
	       	 System.out.print(" " +i);
	         }
	     }
	}
}

//TC = O(n)
//SC = O(1)

//code360: https://bit.ly/3vzQ7yr
//gfg : https://www.geeksforgeeks.org/problems/sum-of-all-divisors-from-1-to-n4738/1