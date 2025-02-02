package partie4.thread;

class MyThread extends Thread {
    public void run() {
        try {
            Thread.sleep(1000); // Move to TIMED_WAITING state
            System.out.println(Thread.currentThread().getName() + " is running - " +this.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ThreadStateExample {
	
    public static void main(String[] args) {
    	
        MyThread t = new MyThread();

        // Check state before starting
        System.out.println("State before start --: " + t.getState()); // NEW

        t.start(); // Start thread

        // Check state after starting
        System.out.println("State after start: " + t.getState()); // RUNNABLE or TIMED_WAITING

        try {
            Thread.sleep(500); // Main thread sleeps
            System.out.println("State during execution: " + t.getState()); // TIMED_WAITING
            t.join(); // Wait for t to finish
        } 
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Check state after completion
        System.out.println("State after completion: " + t.getState()); // TERMINATED
    }
}
