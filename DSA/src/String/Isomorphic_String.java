package String;

public class Isomorphic_String {
	
	static void IsomorphicStrings(String s,String t) {
		if(s.length() != t.length()) {
			System.out.println("Not Isomorphic");
		    return ;
		}
		int mapS[] = new int[256]; // Mapping from s to t //it will create a array of size 256 and assigned 0 for each ASCII 
		int mapT[] = new int[256];  // Mapping from t to s
		
		for(int i=0;i<s.length();i++) {
            char cs = s.charAt(i);
            char ct = t.charAt(i);
            
            if(mapS[cs]==0 && mapT[ct]==0) { //If both are 0, then this is the first time these characters are being seen, and it’s safe to create a new mapping.
            	mapS[cs]=ct;
            	mapT[ct]=cs;
            }else {
            	if(mapS[cs]!=ct || mapT[ct]!=cs) { //If there's any mismatch, that means the mapping is inconsistent
            		System.out.println("Not Isomorphic");
            		return ;
            	}
            }
		}
		System.out.println("Isomorphic");
	}

	public static void main(String[] args) {
		String s = "paper";
		String t = "title";
		IsomorphicStrings(s,t);

	}

}
//Time Complexity: O(n)
// Space Complexity: O(1)