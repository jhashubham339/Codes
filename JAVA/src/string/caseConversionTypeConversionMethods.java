package string;

public class caseConversionTypeConversionMethods {

	public static void main(String[] args) {
		
		// Case Conversion
		String s = "Shubham";
		String s1 = "ROHAN";
		System.out.println(s.toUpperCase()); // SHUBHAM
		System.out.println(s1.toLowerCase()); //rohan
		
		System.out.println("----------------------------");
		
		// Type Conversion
		int a =10 , b=20;
		String s2 =String.valueOf(a+b); //30
		System.out.println(s2);
		String s3 =String.valueOf(a);
		String s4 =String.valueOf(b);
		System.out.println(s3+s4);    //1020
		
		char[] c= s.toCharArray();
		System.out.println(c);    //Shubham
	}

}
