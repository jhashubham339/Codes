package oops;

public class finalKeyword {

	public static void main(String[] args) {
		 int i=10; //final       // final int i=10 when make it final throw error
		i= i+20;                //error (We can't change the value)
		System.out.println(i); //print 30

	}

}

//We can use final keyWord with 1.Variable 2.Method 3.Class
//If you want other person can't override my method then make it as a final.