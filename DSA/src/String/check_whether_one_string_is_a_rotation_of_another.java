package String;

public class check_whether_one_string_is_a_rotation_of_another {
	
	static void RotateString(String s,String goal) {
		if(s.length() != goal.length()) {
			System.out.println("Not matched");
		}
		// Check if goal is a substring of s + s
		String twice = s + s;
		if(twice.contains(goal)) {
			System.out.println("Matched");
		}else {
			System.out.println("Not Matched");
		}
		//System.out.println(twice.contains(goal));
	}

	public static void main(String[] args) {
		String s = "abcde", goal = "cdeab";
		RotateString(s,goal);
	}

}
//Time Complexity: O(n)
//Space Complexity: O(n)