package collection;

import java.util.HashMap;

public class hashMap_collection {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put(101 , "Shu");
		hm.put(102 , "kamal");
		hm.put(103 , "Rahul");
		hm.put(104 , "Rohan");
		
		System.out.println(hm); //Output -> {101=Shu, 102=kamal, 103=Rahul, 104=Rohan}
		
		System.out.println(hm.get(103)); 
		System.out.println(hm.size()); 
		System.out.println(hm.containsKey(102));     
		System.out.println(hm.containsValue("Rohan")); 

	}

}
