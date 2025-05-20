package String;

public class Maximum_Nesting_Depth_of_Paranthesis {
	
	static void MaxNestingDepth(String s) {
		int max =0, current =0;
		
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			
			if(ch =='(') {
				current++;
				if(current>max) {
					max = current;
				}
			}else if(ch ==')') {
				current--;
			}
		}
		System.out.println(max);
	}

	public static void main(String[] args) {
		String s = "(1+(2*3)+((8)/4))+1";
		MaxNestingDepth(s);
	}

}
//https://www.youtube.com/watch?v=OqQdQ7dKlI0
//Time Complexity: O(n)
//Space Complexity: O(1)