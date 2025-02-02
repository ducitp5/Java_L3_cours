package partie4.thread;

public class ThreadStatusExample {

	public static void main(String[] args) {
		
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(2000); // Simulate some work
            } 
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Check status before starting
        System.out.println("Thread state before start: " + thread.getState()); // NEW

        thread.start();

        // Check status after starting
        System.out.println("Thread state after start: " + thread.getState()); // RUNNABLE

        try {
            Thread.sleep(500); // Wait for the thread to potentially enter TIMED_WAITING
            System.out.println("Thread state after sleep: " + thread.getState()); // TIMED_WAITING

            thread.join(); // Wait for the thread to finish
            System.out.println("Thread state after join: " + thread.getState()); // TERMINATED
        } 
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}