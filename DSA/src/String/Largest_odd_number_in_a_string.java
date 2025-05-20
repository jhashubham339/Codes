package String;

public class Largest_odd_number_in_a_string {
	
	static void largestOddNumber(String s) {
		for(int i=s.length()-1;i>=0;i--) {
			char ch = s.charAt(i);
			if((ch-'0') % 2 != 0) {
				System.out.println(s.substring(0,i+1)); //substring(0, i + 1) means: Start from index 0 Go up to and excluding index i + 1
				
			}
		}
        // If no odd digit is found
        System.out.println("");
	}

	public static void main(String[] args) {
		  String s = "4206";
		  largestOddNumber(s);
	}

}

//https://www.youtube.com/watch?v=eICBvqI4qTE
// Time Complexity: O(n)
//Space Complexity: O(n)