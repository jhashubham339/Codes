package oops;

class Employee {
	private int empId;     
	public void setEmpId(int id) {
		empId = id;
	}
	public int getEmpId() {
		return empId;
	}
}
public class encapsulation {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setEmpId(100);
		System.out.println(" " +e.getEmpId());
	}

}
