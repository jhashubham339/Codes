package collection;
import java.util.ArrayList;
public class arrayList {

	public static void main(String[] args) {
ArrayList al = new ArrayList();
		
		al.add(0,20);                //add()
		al.add(1,20);
		al.add(2,"Shubham");
		al.add(3,50);
		
		System.out.println(""+al);                          // Output -> [20, 20, Shubham, 50]
		
		ArrayList aa = new ArrayList();
		aa.add("Ram");
		System.out.println(""+aa);                          // Output -> [Ram]
		
	   al.addAll(0, aa);                //addAll()
		System.out.println(""+al);                          // Output -> [Ram, 20, 20, Shubham, 50]
		
		al.remove(1);
		System.out.println(""+al);      //remove()          // Output -> [Ram, 20, Shubham, 50]
		
		//al.clear();                     //clear()
	//	System.out.println(""+al);
		
		System.out.println(""+al.contains(20));  //contains()  // Output -> true
		
		System.out.println(""+al.size());       // size()      // Output -> 4
		
		System.out.println(""+al.get(2));       //get()        // Output -> Shubham
		 
		al.set(0, 500);                         //set()        // Output -> [500, 20, Shubham, 50]
		System.out.println(""+al);
		
		                        
		System.out.println(""+al.indexOf(20));  //indexOf()    // Output -> 1

	}

}
