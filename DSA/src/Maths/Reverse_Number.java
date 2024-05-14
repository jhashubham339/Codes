//3.Reverse Number: Ex: N =7789 OUTPUT: 9877

package Maths;

public class Reverse_Number {

	public static void main(String[] args) {
		int n=7789,lastDigit,reverse=0;
		while(n>0) {
			lastDigit = n%10;
			n=n/10;
			reverse = (reverse * 10) + lastDigit; // (0*10)+9 = 9 ,(9*10)+8 = 98 so on..
		}
		System.out.println("output = " +reverse);
	}
}

//output = 9877

//TC = O(log n)
//SC = O(1)

//code360: https://bit.ly/3vCeBXS
//leetcode : https://leetcode.com/problems/reverse-integer/description/