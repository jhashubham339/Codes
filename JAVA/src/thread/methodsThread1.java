package thread;

public class methodsThread1 {

	public static void main(String[] args) {
		System.out.println("Hello");
		
	// SetName() and getName()
		System.out.println(Thread.currentThread().getName());  // main
		Thread.currentThread().setName("Shubham");
		System.out.println(Thread.currentThread().getName());  //shubham
		System.out.println(Thread.currentThread().isAlive());  // true
	}

}
