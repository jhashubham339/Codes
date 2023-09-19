package generics;

public class Box<T> {
    T container; //object class is top most parent class of all the java classes
	
	public Box(T container) {
		this.container = container; 
	}
	
	public T getValue() {
		return this.container;
	}

}
