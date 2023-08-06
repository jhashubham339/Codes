package string;

public class addUpdateMethods {

	public static void main(String[] args) {
		//Add two String
		
				String s1 = "Rohan";
				String s2 = "Amit";
				System.out.println(s1+s2); // output = RohanAmit
				System.out.println(s1+20);  //output = Rohan20
				System.out.println(20+s1);  //output = 20Rohan
				System.out.println(20+10+s1);  //output = 30Rohan
				System.out.println(20-10+s1);  //output = 10Rohan
				//System.out.println(s1+20-10);  //output = Error
				
				//concat() method
				String s3 = "Rohan";
				String s4 = "Amit";
				System.out.println(s3.concat(s4)); // output = RohanAmit
				
				//subSequence()
				String s = "This is Shubham";
				System.out.println(s.subSequence(0,9)); // output = This is S
				
				System.out.println("----------------------------------------");
				
				String a = "This is Shubham";
				System.out.println(a.replace("is", "was")); //output = Thwas was Shubham
				System.out.println(a.replaceFirst("is", "was")); //output = Thwas is Shubham
				System.out.println(a.replaceAll("is(.)", "was")); //output = ThwaswasShubham

	}

}
