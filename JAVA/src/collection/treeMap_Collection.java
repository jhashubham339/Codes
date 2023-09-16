package collection;

import java.util.TreeMap;

public class treeMap_Collection {

	public static void main(String[] args) {
		TreeMap tm = new TreeMap();
//		tm.put(101 , "Shu");
//		tm.put(102 , "amit");
//		tm.put(103 , "kamal");
//		tm.put(104 , "Rahul");
//		tm.put(105 , "Rohan"); //Output -> {101=Shu, 102=amit, 103=kamal, 104=Rahul, 105=Rohan}
		
		tm.put("shu",101);
		tm.put("amit",102);
		tm.put("kamal",103);
		tm.put("rahul",104);
		tm.put("rohan",105);  // OutPut ->{amit=102, kamal=103, rahul=104, rohan=105, shu=101}
		
		System.out.println(tm);

	}

}
