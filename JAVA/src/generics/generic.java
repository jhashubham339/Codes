package generics;
import java.util.*;               // it import all the classes
public class generic {

	public static void main(String[] args) {
		
      List<String> list = new ArrayList<>();
		
		list.add("Shubham");
		list.add("Rohan");
		list.add("Saurrabh");
		//list.add(45);             // error can't accept the integer values(Type safety)
		
		System.out.println(list);

	}

}
