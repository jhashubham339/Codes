package String;

public class Sum_of_Beauty_of_All_Substrings {
	
	static void beautySum(String s) {
		int totalBeautySum =0;
		// Loop over all substrings
		for(int i=0;i<s.length();i++) {
			int freq[] = new int[26]; // Frequency array for 26 lowercase letters
			
			for(int j=i;j<s.length();j++) {
				freq[s.charAt(j)-'a']++; // Update frequency of current character
				
				int max =0;
				int min = Integer.MAX_VALUE; //We initialize min to Integer.MAX_VALUE so that we can correctly find the minimum non-zero frequency of characters in the current substring.
			
				for(int k=0;k<26;k++) { // Go through all 26 characters
					if(freq[k]>0) {  // Only consider characters that exist in substring
						max = Math.max(max, freq[k]);
						min = Math.min(min, freq[k]);
					}
				}
				totalBeautySum = totalBeautySum + (max-min);
			}	
			
		}
		System.out.println(totalBeautySum);
	}

	public static void main(String[] args) {
		String s = "aabcb";
		beautySum(s);
	}

}

//TC = O(n2)