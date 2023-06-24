package oops;

public class initializeObjectReferanceVeriable {
	
	int age;
	String colour;

	public static void main(String[] args) {
		
		initializeObjectReferanceVeriable cat = new initializeObjectReferanceVeriable();
		cat.age=12;
		cat.colour = "Black";
		
		System.out.println("Age :" +cat.age + " Colour : "+cat.colour);
	}

}
