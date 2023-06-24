//super keyWord is a referance variable which is used to refer immediate parent class object
package oops;

class Sp{
	int a =10;
}
class Bp extends Sp{
	int a=20;              //instance Veriable 
	
	void show(int a) {
		System.out.println(a);        //obj.show(30) print here
		System.out.println(this.a);   // this keyWord refer to the current class instance variable.
		System.out.println(super.a); //super refer to the parent class instance variable 
	}
}
public class superKeyword {

	public static void main(String[] args) {
		Bp obj = new Bp();
		obj.show(30);

	}

}
