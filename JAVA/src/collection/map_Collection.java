package collection;
import java.util.HashMap;
import java.util.Map;
public class map_Collection {

	public static void main(String[] args) {
		
		Map m = new HashMap();
		m.put(101 , "Shu");
		m.put(102 , "kamal");
		m.put(103 , "Rahul");
		m.put(104 , "Rohan");
		System.out.println(m); // Output-> {101=Shu, 102=kamal, 103=Rahul, 104=Rohan}
		
		// m.clear();
		
		System.out.println(m.containsKey(102));      // Output -> true
		System.out.println(m.containsValue("Rohan")); //Output -> true
		System.out.println(m.get(103));               //Output -> Rahul
		m.remove(102);
		System.out.println(m);                       // Output -> {101=Shu, 103=Rahul, 104=Rohan}
		System.out.println(m.size());                // Output -> 3

	}

}
