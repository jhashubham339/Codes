package Array;

public class Pascal_Triangle3 {
	
	static long nCr(int n,int r) {
		int res=1;
		for(int i=0;i<r;i++) {
			res = res * (n-i);
			res = res / (i+1);
		}
		return res;
	}
	
    // Function to print Pascal's Triangle
     static void printPascalTriangle(int n) {
        for (int i = 0; i < n; i++) { // i is the row number
            for (int j = 0; j <= i; j++) { // j is the element in the row
                System.out.print(nCr(i, j) + " ");
            }
            System.out.println();
        }
    }

	public static void main(String[] args) {
		int n=6;
		printPascalTriangle(n);
	}

}
