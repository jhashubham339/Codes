package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class iterator_Collection {

	public static void main(String[] args) {
		List l = new ArrayList();
		l.add(100);
		l.add(200);
		l.add(500);                   //Output ->  [100, 200, 500]
		
		System.out.println(" "+l);
		
		Iterator itr = l.iterator();

		while(itr.hasNext()) {                      // -> 100
			System.out.println(""+itr.next());      // 200
			                                        // 500
		}

	}

}
