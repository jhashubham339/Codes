package thread;

public class threadYield extends Thread{
	
	public void run() {
		for(int i =0 ;i<=5;i++) {
			System.out.println(Thread.currentThread().getName() +"-" +i);
		}
	}

	public static void main(String[] args) {
		
		threadYield t = new threadYield();
		t.start();
		for(int i =0 ;i<=5;i++) {
			System.out.println(Thread.currentThread().getName() +"-" +i);
		}
	}

}
