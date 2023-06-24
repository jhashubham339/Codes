package oops;

public class staticMethod {
	static void display() {
		System.out.println("1");
	}
	public static void main(String[] args) {
		display();   // no need to create the object, so save the memory
		//staticMethod.display(); //also works
		
		demo.display2(); //but while calling other class method we have to use class name also
	}
	
	class demo{
		static void display2() {
			System.out.println("2");
		}
	}
}
