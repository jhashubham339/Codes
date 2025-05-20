package Array;

public class Pascal_Triangle2 {
	
	static long nCr(int n,int r) {
		int res=1;
		for(int i=0;i<r;i++) {
			res = res * (n-i);
			res = res / (i+1);
		}
		return res;
	}
	
	static void pascalTri(int n) {
		for(int c=1;c<=n;c++) {
			int element = (int) nCr(n-1,c-1);
				System.out.print(element +" ");
		}
	}

	public static void main(String[] args) {
		int n=5;
		pascalTri(n);
	}

}

//Time Complexity: O(n*r)
//Space Complexity: O(1)
