package collection;
import java.util.TreeSet;
public class treeSet_Collection {

	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet();
		
		ts.add(30);
		ts.add(60);
		ts.add(50);
		ts.add(10);
		ts.add(20);
		
		System.out.println(ts); //Output -> [10, 20, 30, 50, 60]
		
		ts.clear();
		System.out.println(ts);  //Output -> []
		
		System.out.println(ts.remove(10)); // Output -> 10 removed

	}

}
