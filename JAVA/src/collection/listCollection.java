package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class listCollection {

	public static void main(String[] args) {
		List l = new ArrayList();
		l.add(0, 10);
		l.add(1, 20);
		l.add(2, 30);
		l.add(null);
		l.add(null);
		l.add(100);
		System.out.println(" " + l);

		// Retrieving Elements from Collection
		// in Java (For-each, Iterator, ListIterator & EnumerationIterator)
		Iterator itr = l.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
