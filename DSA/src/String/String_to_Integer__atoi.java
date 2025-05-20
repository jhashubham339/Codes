package String;

public class String_to_Integer__atoi {
	
	static int stringToInteger(String s) {
		//1st Condition : Whitespace: Ignore any leading whitespace (" ").
		s = s.trim();
		if(s.isEmpty()) {
			//return 0;
		}
		//2nd Condition : Signedness: Determine the sign by checking if the next character is '-' or '+', 
	    // assuming positivity if neither present.
		int i=0;
		int sign=1;
		long num =0;
        if (s.charAt(i) == '-' || s.charAt(i) == '+') {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }
		
		// 3rd Condition : Conversion: Read the integer by skipping leading zeros until a non-digit character is
		//encountered or the end of the string is reached. If no digits were read, then the result is 0.
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            num = num * 10 + (s.charAt(i) - '0');

            // Overflow check
            if (sign * num > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (sign * num < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }

            i++;
        }
        return (int) (sign * num);
	}

	public static void main(String[] args) {
		String s = "words and 987";
		System.out.println(stringToInteger(s));  
		System.out.println(stringToInteger("4193 with words")); 

	}

}
