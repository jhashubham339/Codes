package collection;

import java.util.Vector;

public class vector_collection {

	public static void main(String[] args) {
		Vector v = new Vector();
		
		v.add("Shu");
		v.add(100);
		
		System.out.println(v); // Output -> [Shu, 100] 
		
		v.addElement("Ram");
		System.out.println(v); //Output -> [Shu, 100, Ram]
		
		System.out.println(v.firstElement()); //Output ->Shu
		System.out.println(v.lastElement()); //Output ->Ram
	//	System.out.println(v.removeElement(100)); // Output ->true
	//	System.out.println(v);                    // [Shu, Ram] removed 100
		
	//	System.out.println(v.removeElementAt(1));  // 1 is index
	//	System.out.println(v.removeAllElements());
	}

}
