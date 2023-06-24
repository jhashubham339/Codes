package oops;

class employeee{
	String Name;
	int Id;
}

class student extends employeee{
	String city;
}
public class inheratance {

	public static void main(String[] args) {
		student s = new student();
		s.Name ="Shubham";
		s.Id =101;
		s.city ="Patna";
		
		System.out.println("Name :"+s.Name);
		System.out.println("Id :"+s.Id);
		System.out.println("City :"+s.city);
	}

}
