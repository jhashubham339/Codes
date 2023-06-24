// Compile-time polymorphism
package oops;

class overloading{
	void method(int a , int b) {
		int c = a+b;
		System.out.println("Sum is :"+c);
	}
	void method(String Name) {
		System.out.println("Name is :"+Name);
	}
}
//class abc extends overloading{
//	void method(float p) {
//		System.out.println("inheritance");
//	}
//	
//}
public class methodOverloading {

	public static void main(String[] args) {
		overloading aa = new overloading();
		aa.method(10,20);
		aa.method("Shubham");
//		abc pqr = new abc();
//		pqr.method(4.22f);

	}

}
