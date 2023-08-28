package thread;

public class DaemonThread extends Thread{

    public void run()
    {
        System.out.println("Thread name: " + Thread.currentThread().getName()); //Exception in thread "main" Thread name: Thread-0
        System.out.println("Check if its DaemonThread: "+ Thread.currentThread().isDaemon());   //Check if its DaemonThread: false
    }
	public static void main(String[] args) {
		  DaemonThread t1 = new DaemonThread();
	        DaemonThread t2 = new DaemonThread();
	        t1.start();
	         
	        // Exception as the thread is already started
	        t1.setDaemon(true);
	         
	        t2.start();

	}

}
