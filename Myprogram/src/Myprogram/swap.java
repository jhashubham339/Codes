package Myprogram;
import java.util.Scanner;
public class swap {

	  public static void main(String[] args) {  
	       int x, y, temp;// x and y are to swap   
	       Scanner sc = new Scanner(System.in);  
	       System.out.print("Enter the value of X and Y :");  
	       x = sc.nextInt();  
	       y = sc.nextInt();  
	      
	       System.out.println("before swapping numbers: "+x +"  "+ y);  
	       /*swapping */  
	       temp = x;  
	       x = y;  
	       y = temp;  
	       System.out.println("After swapping: "+x +"   " + y);  
	       System.out.println( );  
	    }    
	}  