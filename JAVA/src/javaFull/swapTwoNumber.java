package javaFull;
import java.util.Scanner;
public class swapTwoNumber {

	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number :");
		a = sc.nextInt();
		System.out.println("Enter the Second Number :");
		b = sc.nextInt();
		
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("a is = " +a);
		System.out.println("b is = " +b);
	}

}
