package javaFull;
import java.util.Scanner;
public class swapTwoNumberUsingThirdVariable {
	
	public static void main(String[] args) {
		int a , b , temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First number :");
		a = sc.nextInt();
		System.out.println("Enter the Second number :");
		b = sc.nextInt();
		
		temp = a;
		a = b;
		b = temp;
		System.out.println("a is = " +a);
		System.out.println("b is = " +b);
	}
}
