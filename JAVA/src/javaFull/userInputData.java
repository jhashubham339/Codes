package javaFull;
import java.util.Scanner;
public class userInputData {

	public static void main(String[] args) {
		int id;
		String name;
		char gender;
		long Mob_No;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the id : ");
		id = sc.nextInt();                                // Int
		
		System.out.print("Enter the Name : ");
		name = sc.next();                                 // String
		
		System.out.print("Enter the gender : ");
		gender = sc.next().charAt(0);                     // Char
		
		System.out.print("Enter the Mob_No : ");
		Mob_No = sc.nextLong();                           // Long
		
		System.out.println("----------------------");
		System.out.println("Id : "+id);
		System.out.println("Name : "+name);
		System.out.println("Gender : "+gender);
		System.out.println("Mobile Number : "+Mob_No);

	}

}
