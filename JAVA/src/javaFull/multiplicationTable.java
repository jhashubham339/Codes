package javaFull;
import java.util.Scanner;
public class multiplicationTable {

	public static void main(String[] args) {
		int n ,i;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		n = sc.nextInt();
		
		for(i=1 ;i<=10;i++) {
			System.out.println(+n + " * " +i + " = " + n*i);
		}

	}

}
