package oops;
class AA {
	void methodAA() {
		System.out.println("This is Class A");
	}
}
class BB extends AA{
	void methodBB() {
		System.out.println("This is Class B");
	}
}
class C extends BB{
	void methodC() {
		System.out.println("This is Class C");
	}
}
public class inheritanceMultilevel {
	public static void main(String[] args) {
		C a = new C();
		a.methodAA();
		a.methodBB();
		a.methodC();
	}
}
