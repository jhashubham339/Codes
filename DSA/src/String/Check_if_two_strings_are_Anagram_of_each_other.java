package String;

public class Check_if_two_strings_are_Anagram_of_each_other {
	
	static void validAnagram(String s, String t){
		if(s.length() != t.length()) {
			System.out.println("Not Valid Anagram");
			return;
		}
		int count[] = new int[26]; // for 26 lowercase English letters
		for(int i=0;i<s.length();i++) {
			count[s.charAt(i) - 'a']++; // increment count for each character in s
		}
		for(int i=0;i<t.length();i++) {
			count[t.charAt(i) - 'a']--; // decrement count for each character in t
		}
		for(int i=0;i<count.length;i++) {
			if(count[i]!=0) {   //If any count is not zero, it means there was a mismatch not Valid Anagram
				System.out.println("Not Valid Anagram");
				return;
			}
		}
		System.out.println("Valid Anagram"); //If all counts are zero, they are valid anagrams.
	} 

	public static void main(String[] args) {
		String s = "anagram", t = "nagaram";
		validAnagram(s,t);

	}

}
//https://www.youtube.com/watch?v=wKF6L9Zo8PQ
//Time Complexity: O(n)
//Space Complexity: O(1)