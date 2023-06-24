package Basic;

//import java.util.Scanner;
public class addMatrix {
	public static void main(String args[]) {
//		int n ,m,i,j;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the row and column of the matrix :");
//		n=sc.nextInt();
//		m=sc.nextInt();
//		
//		int a[][] = new int [m][n];
//		int b[][] = new int [m][n];
//		int c[][] = new int [m][n];
//		
//		System.out.println("Enter the first matrix : ");
//		for(i=0;i<m;i++) {
//			for(j=0;j<n;j++) 
//				a[i][j]=sc.nextInt();
//		}
//		System.out.println("enter the second matrix: ");
//		for(i=0;i<m;i++) {
//			for(j=0;j<n;j++) 
//				b[i][j] = sc.nextInt();
//		}
//		for(i=0;i<m;i++) {
//			for(j=0;j<n;j++)
//				c[i][j] = a[i][j]+b[i][j];
//		}
//		for(i=0;i<m;i++) {
//			for(j=0;j<n;j++)
//				System.out.println("The sum is:" + c[i][j]);
//		}
		
		
		int a[][]= {{1,2,3},{2,6,5},{4,6,5}};
		int b[][]= {{2,6,5},{5,4,9},{5,8,7}};
		int c[][] = new int [3][3];  // row and column
		int i,j ;
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) 	
		 c[i][j]=a[i][j]+b[i][j];
}
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++)
				System.out.println("sum is "+c[i][j]);
}
	//	System.out.println();
}
}
