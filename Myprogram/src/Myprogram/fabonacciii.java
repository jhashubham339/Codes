package Myprogram;

import java.util.Scanner;
public class fabonacci {
	public static void main(String[] args) {
		int a1=0, a2=1,a3 ,i,n;
		
		Scanner sc= new Scanner(System.in);
		{
			System.out.print("Enter the number :");
			n=sc.nextInt();
		}
			System.out.print(" "+a1 +" " +a2);
		 for(i=2;i<=n;i++)
		 {
			 a3=a1+a2;
			 System.out.print(" "+a3);
             a1=a2;
             a2=a3;
	     }

     }
}
