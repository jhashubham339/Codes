package oops;
class A {
	public void methodA() {
		System.out.println("this is perent class");
	}
}
class B extends  A{
	public void methodB() {
		System.out.println("this is child class");
	}
}
public class inheritanceSinglelevel {

	public static void main(String[] args) {
		B a = new B();
		a.methodA();
		a.methodB();
	}

}
