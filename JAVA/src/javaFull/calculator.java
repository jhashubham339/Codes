package javaFull;
import java.util.Scanner;
public class calculator {

	public static void main(String[] args) {
		int a,b,c;
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the First number :");
		a = sc.nextInt();
		System.out.print("Enter the Second number :");
		b = sc.nextInt();
		System.out.println("+ , - , * , / ");
		ch = sc.next().charAt(0);
		switch(ch)
		{
		case '+' : c = a + b;
		System.out.print("Answer is : "+c);
		 break;
		 
		case '-' : c = a - b;
		System.out.print("Answer is : "+c);
		 break;
		 
		case '*' : c = a * b;
		System.out.print("Answer is : "+c);
		 break;
		 
		case '/' : c = a / b;
		System.out.print("Answer is : "+c);
		 break;
		 
		 default : System.out.print("Invalide input.....");
		 break;
		}
	}

}
