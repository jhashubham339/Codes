package Myprogram;

import java.util.Scanner;
public class Addmatrix {

	public static void main(String[] args) {
		int n,m,i,j;
		Scanner sc = new Scanner(System.in);
		//Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter the row and column :");
		n=sc.nextInt();
		m=sc.nextInt();
		
		int a[][]= new int[m][n];
		int b[][]= new int[m][n];
		int c[][]= new int[m][n];
		
		System.out.println("Enter the first matrix");
		for(i=0;i<m;i++)
		{
		  for(j=0;j<n;j++)
		    a[i][j]=sc.nextInt();
		}
    	System.out.println("Enter the second matrix:");
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)	
				b[i][j]=sc.nextInt();
		}
		
		 System.out.println("Sum is :");
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)	
			 c[i][j]=a[i][j]+b[i][j];
		}
			 for(i=0;i<n;i++)
			{
				for(j=0;j<m;j++)
			System.out.println(""+c[i][j]);
			}
		
	  }
}
