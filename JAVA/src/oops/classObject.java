package oops;

public class classObject {
	
	public void eat() {
		System.out.println("I am eating");
	}

	public static void main(String[] args) {
		
		System.out.println("1");
		
		classObject animal = new classObject();
		animal.eat();
	}

}
