package collection;
import java.util.ArrayList;
public class allCollectionMethods {

	public static void main(String[] args) {
ArrayList al = new ArrayList();
		
		al.add(10);
		al.add(30);
		al.add("Shubham");
		System.out.println(al);               //Output -> [10, 30, Shubham]
		
		ArrayList al2 = new ArrayList();
		al2.addAll(al);
		System.out.println(al2);             // Output -> [10, 30, Shubham] All added from al to al2
		
		//al.clear();
		//System.out.println(al);              // Output -> [] All clear 
		
		al.remove(1);
		System.out.println(al);               // Output -> [10, Shubham] index number 1 element is removed
		
		int size = al.size();
		System.out.println(size);             // Output -> 2
		
		boolean empty = al.isEmpty();
		System.out.println(empty);            // Output -> false 
		
		
		System.out.println(al.contains(10));   //Output -> true
		

	}

}
