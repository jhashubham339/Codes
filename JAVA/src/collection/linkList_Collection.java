package collection;
import java.util.LinkedList;
public class linkList_Collection {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		
		ll.add("Shubham");
		ll.add(400);
		ll.add(120);
		ll.add('c');
		
		System.out.println(" "+ll);                  // Output ->  [Shubham, 400, 120, c]
		
		ll.addFirst("Rohan");          //addFirst()
		System.out.println(" "+ll);                  // Output -> [Rohan, Shubham, 400, 120, c]
		
		ll.addLast(500);
		System.out.println(" "+ll);     //addLast()  // Output ->  [Rohan, Shubham, 400, 120, c, 500]
		
		ll.removeFirst();
		System.out.println(" "+ll);   //removeFirst()  // Output ->  [Shubham, 400, 120, c, 500]
		                              //removeLast()
		
		System.out.println(" "+ll.getFirst()); //getFirst() // Output -> Shubham
		                                       //getLast()
	}

}
