package oops;

public class method {
	public void eat() {
		System.out.println("I am eating");
	}

	public void run() {
		System.out.println("I am running");
	}


	public static void main(String[] args) {
		System.out.println("I am Main method");
		method dog = new method();
		dog.eat();
		dog.run();
		car cc = new car();
		cc.bmw();

	}
}
class car {
	void bmw() {
		System.out.println("I am on the way");
	}
}

