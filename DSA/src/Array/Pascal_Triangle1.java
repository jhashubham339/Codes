package Array;
//We have an easier formula to find out the element i.e. r-1Cc-1.
//nCr = n! / (r! * (n-r)!)



public class Pascal_Triangle1 {
	
	static long nCr(int n,int r) {
		int res=1;
		for(int i=0;i<r;i++) {
			res = res * (n-i);
			res = res / (i+1);
		}
		return res;
	}
	
	static void pascalTri(int r,int c) {
		int element = (int) nCr(r-1,c-1);
		System.out.println(element);
	}

	public static void main(String[] args) {
		int r=5;
		int c = 3;
		pascalTri(r,c);

	}

}
//Time Complexity: O(c)
//Space Complexity: O(1)
