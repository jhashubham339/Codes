package Myprogram;
//import java.util.Scanner;
public class infinitearray
	{
		public static void main(String[] args) {
	    	 int i,j,target = 9;
	    	 int arr[] = {2,3,5,6,9};
	    	// Scanner sc = new Scanner(System.in);  
	    	// System.out.print("Enter the values");
	    	// nums = sc.nextInt();  
		       //j = sc.nextInt();  
		       
	        for(i=0;i<arr.length;i++)
	        {
	            for(j=i+1;i<arr.length;j++)
	            {
	                if(arr[i]+arr[j] == target )
	                   //&& nums[i]+nums[j]!=i)
	                	 System.out.print(""+ arr[i]);             
	       
	            }
	        } 
	       
	    }

}