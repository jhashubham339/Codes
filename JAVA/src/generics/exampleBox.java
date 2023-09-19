package generics;

//This Program connected to the Box.java
public class exampleBox {

	public static void main(String[] args) {
		Box<String> box = new Box<>("Water");
		System.out.println(box.getValue());  //Output -> Water
		
		Box<Integer> box1 = new Box<>(123);
		System.out.println(box1.getValue());  // Output -> 123
		
		Box<Boolean> box2 = new Box<>(true);
		System.out.println(box2.getValue());  // Output -> true
		
		Box<Double> box3 = new Box<>(10.5453);
		System.out.println(box3.getValue());  // Output -> 10.5453

	}

}
