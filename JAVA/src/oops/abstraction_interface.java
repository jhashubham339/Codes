package oops;

interface I1{
	void show(); //point
}
class test2 implements I1{ //point
	public void show() { //point
		System.out.println("interface");
	}
}
public class abstraction_interface {

	public static void main(String[] args) {
		   // I1 i = new I1();  point
				test2 t = new test2();
				t.show();

	}

}
