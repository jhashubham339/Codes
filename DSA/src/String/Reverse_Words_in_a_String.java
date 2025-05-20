package String;

public class Reverse_Words_in_a_String {
	
	static void reverseWords(String s) {
		String words[] = s.split(" +"); // + commonly used when you want to split a string by one or more spaces.
		StringBuilder result = new StringBuilder();
		for(int i =words.length-1;i>=0;i--) {
			result.append(words[i]);
			result.append(" ");
		}
		System.out.println(result.toString().trim());
	}

	public static void main(String[] args) {
		String s = "the sky  is blue";
		reverseWords(s);
	}

}

//https://www.youtube.com/watch?v=tX-ZcKTNwYk
//Time Complexity: O(n)
//Space Complexity: O(n)