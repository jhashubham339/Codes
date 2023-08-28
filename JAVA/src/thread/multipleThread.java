package thread;

class Test1 extends Thread{
	public void run() {
		System.out.println("Test Task 1");
	}

}
class Test2 extends Thread{
	public void run() {
		System.out.println("Test Task 2");
	}

}
public class multipleThread {
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		t1.start();
		
		Test2 t2 = new Test2();
		t2.start();

	}

}
