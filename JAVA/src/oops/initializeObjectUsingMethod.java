package oops;

public class initializeObjectUsingMethod {
	
	int age;
	String colour;
	
	void abc(int a , String c) {
		age = a;
		colour = c;
	}
	
	void display() {
		System.out.println("Age : "+age +" colour :"+colour);
	}

	public static void main(String[] args) {
		initializeObjectUsingMethod cat = new initializeObjectUsingMethod();
		cat.abc(12,"Black");
		cat.display();
	}

}
