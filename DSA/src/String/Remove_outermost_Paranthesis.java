package String;

public class Remove_outermost_Paranthesis {
	
	static void removeOutermostParanthesis(String s) {
		int count = 0; // Tracks depth of parentheses
		StringBuilder result = new StringBuilder(); //store final output
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) =='(') {
                // If count > 0, it's not the outermost '(', so keep it
				if(count>0) {
					result.append(s.charAt(i));
				}
				count++;// Increase depth
				
			}else if(s.charAt(i) == ')') {
				count--; // Decrease depth first
                // If count > 0 after decrement, it's not the outermost ')'
				if(count>0) {
					result.append(s.charAt(i));
				}
				
			}
		}
		System.out.println(result.toString());
	}

	public static void main(String[] args) {
		String s = "(()())(())()";
		removeOutermostParanthesis(s);
	}

}
//https://www.youtube.com/watch?v=j0aqKmSG12M
//TC = O(n)
//SC =O(1)