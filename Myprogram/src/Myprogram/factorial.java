package Myprogram;

import java.util.Scanner;
public class factorial{
	public static void main(String[] args) {
		int fact=1, i,n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number :");
			n =sc.nextInt();
		for(i=1;i<=n;i++)
		{
			fact= fact*i;
			System.out.println(" "+fact);
		}
	}
}
