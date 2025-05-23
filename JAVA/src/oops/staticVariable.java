//static Variable is a non-access modifiers we can use with Variable(class level) not local level
// Method , Block and Inner class(nested class) not outer class
package oops;

//public class staticVariable {
//	//static int a=10;
//	
//	public static void main(String[] args) {
//	//	System.out.println(Test.a);  //error 
//
//	}
//}

//class Employe{
//	int id;
//	String name;
// String companyName;                                          //static 
//	Employe(int id , String name , String companyName){
//		this.id =id;
//		this.name = name;
//		this.companyName = companyName;
//	}
//
//void display() {
//	System.out.println(id +" "+name + " "+companyName);
//}
//}
//public class staticVariable {
//	public static void main(String[] args) {
//		Employe  e= new Employe(101 ,"Shubham","TCS");
//		e.display();
//		Employe  e2= new Employe(102 ,"Rohan","TCS");
//		e2.display();
//	}
//}


// Static variable are used for memory management

class Employe{
	int id;
	String name;
	static String companyName ="TCS";
	Employe(int id , String name ){
		this.id =id;
		this.name = name;
	}

void display() {
	System.out.println(id +" "+name + " "+companyName);
}
}
public class staticVariable {
	public static void main(String[] args) {
		Employe  e= new Employe(101 ,"Shubham");
		e.display();                                                        
		Employe  e2= new Employe(102 ,"Rohan");
		e2.display();
	}
}
 //same output memory save+

