package Myprogram;

import java.util.Scanner;
public class bubblesort {

	public static void main(String[] args) {
		
		int n, i,j,temp;
		//int arr[]= {55,6,2,3,33,77,12,43,64,5,84 };
		
		
		System.out.println(" Array length: ");
		Scanner sc = new Scanner(System.in);
		  n=sc.nextInt();
		  
		  System.out.println("Enter the Array: ");
		   int arr[] = new int[n];
		   for(i=0;i<n;i++)
		   {
			    arr[i]=sc.nextInt();
		   }
		  
		for(i=0;i<arr.length;i++)
		{
			for(j=0;j<arr.length-1;j++)
				
			{
				if(arr[j]>arr[j+1])
				{
					 temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
					
			}
		}
		for(i=0;i<arr.length;i++)
		{
			 System.out.print(" "+arr[i]);
		}
         
          
	}

}
