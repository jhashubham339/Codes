package exceptionHandling;

public class exception {

	public static void main(String[] args) {
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");    //100/0 called ArithmeticException
		System.out.println(100/0); // Exception in thread "main" java.lang.ArithmeticException:/by zero
		System.out.println("5");   //--at exceptionHandling.exception.main(exception.java:9)
		System.out.println("6");   //solution:-we provide the alternative to execute                        
	

	}

}
