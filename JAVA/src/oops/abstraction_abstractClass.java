package oops;

abstract class vehicle{   //point 1
	abstract void start(); //point 2
}

class bus extends vehicle{
	void start() {  //point3
		System.out.println("Bus starts with key");
	}
}

class scooter extends vehicle{
	void start() { //point 3
		System.out.println("Scooter starts with kick");
	}
}
public class abstraction_abstractClass {

	public static void main(String[] args) {
	//vehicle v = new vehicle(); //point 4
		
		bus b = new bus();
		 b.start();
		 
	    scooter s = new scooter();
	    s.start();
		

	}

}
