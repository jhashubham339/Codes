package string;

public class stringMethods {

	public static void main(String[] args) {
		
		String s = "Shubham";
		System.out.println("Length = "+s.length()); //length
		
		
		String name = "";
		System.out.println(name.isEmpty()); // isEmpty ->return boolean true false
		
		String city = " Patna";
		System.out.println(city.trim()); // trim
		
		System.out.println("-------------------------------------------");
		
		// Comparing two String Methods :-------
		
		String s1 = "Rohan";
		String s2 = "Raju";
		System.out.println(s1.equals(s2)); //equals() ->return boolean true false
		
		String s3 = "Rohan";
		String s4 = "rohan";
		System.out.println(s3.equalsIgnoreCase(s4)); //equals() ->return boolean true false

		String a1 = "a";
		String a2 = "A";
		System.out.println(a1.compareTo(a2));  //compareTo() ->return integer a - A = 97-65 output 32
		
		String a3 = "a";
		String a4 = "A";
		System.out.println(a1.compareToIgnoreCase(a2)); //compareToIgnoreCase() ->ignore upperCase lowerCase
	}

}
