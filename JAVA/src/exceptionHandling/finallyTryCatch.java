package exceptionHandling;

public class finallyTryCatch {

	public static void main(String[] args) {
		
		try {
			int a=100, b=0,c;
			c=a/b;
			System.out.println(c);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("this is finally block");
		}
	}

}
