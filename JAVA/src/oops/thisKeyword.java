//This keyWord is the referance variable that refers to the current class instance variable
package oops;

public class thisKeyword {
	int i;
	void setValue(int i) {  //(int x)
		this.i=i;                 // i=x (works)
	}
	void show() {
		System.out.println(i); //print 10 but when giving setValue(int i) it will throw error
		                       // because i=i solving this error we use this keyWord
	}

	public static void main(String[] args) {
		thisKeyword t = new thisKeyword();
		t.setValue(10);
		t.show();

	}

}
