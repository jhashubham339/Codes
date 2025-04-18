package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
public class listIterator_Collection {

	public static void main(String[] args) {
		
   List li = new ArrayList();
		
		li.add(20);
		li.add(40);
		li.add(50);
		
		System.out.println(" "+li);         //Output -> [20, 40, 50]
		
		ListIterator litr = li.listIterator();
		while(litr.hasNext()) {            //litr.hasPrevious
			System.out.println(""+litr.next());  //previous   //20
			                                                  //40
		}                                                     //50
	}

}
