package oops;
class animal{
	void show() {         //show(int a) pass the argument also
		System.out.println("I am animal");
	}
}
class dog extends animal{
	@Override
	void show() {
		System.out.println("I am dog");
	}
}

public class methodOverriding {

	public static void main(String[] args) {
		// we have to create the object for both the class otherwise 
		// we can not call both the method while creating the child class object
   // we can achieve that by using super keyword
		animal a = new animal();
		a.show();
		
		dog d = new dog();
		 d.show();
	}

}
