package collection;

import java.util.Enumeration;
import java.util.Vector;
public class enumeration_Collection {

	public static void main(String[] args) {
Vector v = new Vector();
		
		v.add(11);
		v.add(22);
		v.add("Shubham");
		v.add(33);
		System.out.println(" "+v);
		
		Enumeration e = v.elements();
		
		while(e.hasMoreElements()) {
			System.out.println(""+e.nextElement());
		}
		

	}

}
