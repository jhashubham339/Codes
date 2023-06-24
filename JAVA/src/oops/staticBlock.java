//Static block executes automatically when the class is loaded in the memory
package oops;

public class staticBlock {

	static {
		System.out.println("Static block");
		
	//	System.exit(0);                    //Stop JVM 
	}
	public static void main(String[] args) {
		System.out.println("i am main method");
	}

}
