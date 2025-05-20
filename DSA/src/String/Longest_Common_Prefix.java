package String;

import java.util.Arrays;

public class Longest_Common_Prefix {
	
	static void longestCommonPrefix(String s[]) {
		Arrays.sort(s);
		
		String first = s[0];           
		String last = s[s.length-1];
		//first = "flow" → length = 4 
		//last = "flowers" → length = 7
        //You should only compare up to the 4th character (index 0 to 3) — otherwise, first.charAt(4) will crash.
		int minLength = Math.min(first.length(), last.length());
		
		int i=0;
		while(i<minLength && first.charAt(i) == last.charAt(i)) {
			i++;
		}
		System.out.println(first.substring(0,i));
	}

	public static void main(String[] args) {
		String s[] ={"flower", "flow", "flight"};
		longestCommonPrefix(s);
	}

}

//https://www.youtube.com/watch?v=XX4ikVj6Bug