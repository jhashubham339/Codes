package String;

public class Print_All_Substrings {
	
	static void printAllSubstrings(String s) {
		int count =0; //count
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<=s.length();j++) {
				System.out.print(s.substring(i,j) + " ");
				count++; //count
			}
		}
		System.out.println("\n"+count); //print count
	}

	public static void main(String[] args) {
        String s = "aabcb";
        printAllSubstrings(s);
	}

}

//Time complexity : O(n²)