package thread;

public class createThreadUsingThread extends Thread{

	public void run() {
		System.out.println("Test task");
	}
	public static void main(String[] args) {
		
		createThreadUsingThread t = new createThreadUsingThread();
		t.start();
	}

}

// Four steps to create the thread by using Thread
/*
1. Extends the thread class
2. Override the run() method
3. Create the object of the class
4. Start the thread by using Start() method 
*/