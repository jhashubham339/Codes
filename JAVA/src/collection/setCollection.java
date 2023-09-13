package collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class setCollection {

	public static void main(String[] args) {
		
		Set s = new HashSet();
		s.add(20);
		s.add(30);
		s.add(30);          // it will not give output duplicate values 
		s.add(null);
		
		
		System.out.println(" "+s);     //Output ->   [null, 20, 30]
		
		//Retrieving Elements from Collection
		// in Java (For-each, Iterator, ListIterator & EnumerationIterator)
		
		Iterator itr =s.iterator();          // -> null                                         
		while(itr.hasNext()) {                   //20
                                                 //30
			System.out.println(itr.next());
		}
	}

}
