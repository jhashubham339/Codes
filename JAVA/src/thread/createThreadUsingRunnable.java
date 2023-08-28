package thread;

public class createThreadUsingRunnable implements Runnable{
	
	public void run() {
		System.out.println("Test Task");
	}

	public static void main(String[] args) {
		
		createThreadUsingRunnable t = new createThreadUsingRunnable();
		Thread th = new Thread(t);
		th.start();
	}

}

//Five steps to create the thread by using Runnable
/*
1. Implements the Runnable interface
2. Override the run() method
3. Create the object of the class
4. Create the object of the thread class & pass the parameter in the constructor  
5. Start the thread by using Start() method 
*/