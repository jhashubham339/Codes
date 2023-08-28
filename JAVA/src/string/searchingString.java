package string;

public class searchingString {

	public static void main(String[] args) {
		String s = "Shubham";
		System.out.println(s.indexOf('u'));      //2
		System.out.println(s.lastIndexOf('a'));  //5
		System.out.println(s.charAt(5));         //a
		System.out.println(s.contains("h"));     // true
		System.out.println(s.startsWith("S"));   //true
		System.out.println(s.endsWith("S"));   //false
	}

}
