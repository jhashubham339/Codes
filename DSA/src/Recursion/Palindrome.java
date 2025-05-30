//

package Recursion;

public class Palindrome {
	
	static boolean isPaliandrome(String s) {
		int i=0, j=s.length()-1;
		while(i<j) {
			//Skip non-alphanumeric characters from the left
			if(!Character.isLetterOrDigit(s.charAt(i))) {
				i++;
			}
			//Skip non-alphanumeric characters from the right
			if(!Character.isLetterOrDigit(s.charAt(j))) {
				j--;
			}
			//Compare characters
			if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

	public static void main(String[] args) {
		String s = "MADAM";
		if(isPaliandrome(s) == true) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
	}
}
//Output: Palindrome 
//Time Complexity =  O(N)
//Space Complexity = O(1)
//LeetCode : https://leetcode.com/problems/valid-palindrome/description/