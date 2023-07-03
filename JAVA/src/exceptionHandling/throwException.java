package exceptionHandling;
import java.util.Scanner;
class youngerAgeException extends RuntimeException{
	youngerAgeException(String msg)
	{
		super(msg);
	}
}
public class throwException {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Age : ");
		int age = s.nextInt();
		try {
			if(age<18) {
				throw new youngerAgeException("You are not eligible for voting");
			}
			else {
				System.out.println("You can Vote successfully");
		         }
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
