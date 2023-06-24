package oops;
class X {
	void methodX() {
		System.out.println("This is Class X");
	}
}

class Y extends X {
	void methodY() {
		System.out.println("This is Class Y");
	}
}
class Z extends X{
	void methodZ() {
		System.out.println("This is Class Z");
	}
}
public class inheritanceHierarchical {

	public static void main(String[] args) {
		Z a = new Z();
		a.methodX();
	//	a.methodY();
		a.methodZ();
	}

}
