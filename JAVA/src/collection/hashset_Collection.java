package collection;

import java.util.HashSet;
import java.util.Iterator;
public class hashset_Collection {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		
		hs.add(100);
		hs.add("Shu");
		hs.add(200);
		hs.add("Ram");         //Output -> based on hashCode values 
		
		System.out.println(hs);
		
		Iterator itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
