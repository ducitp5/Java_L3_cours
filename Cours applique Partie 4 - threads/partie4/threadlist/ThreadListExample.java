package partie4.threadlist;

import java.util.Map;

public class ThreadListExample {
	
    public static void main(String[] args) {

        new Thread(
    		() -> {
            
    			try { Thread.sleep(5000); } catch (InterruptedException e) {}
    		},
    		"CustomThread-1"
		)
        .start();

        new Thread(
    		() -> {
    			try { Thread.sleep(5000); } catch (InterruptedException e) {}
    		}, 
    		"CustomThread-2"
		)
        .start();

        // List all active threads
        listAllThreads();
    }

    public static void listAllThreads() {
    	
        System.out.println("\n=== Listing Active Threads ===");
        
        Map<Thread, StackTraceElement[]> threadMap = Thread.getAllStackTraces();
        
        for (Thread t : threadMap.keySet()) {
        	
        	System.out.println("Thread Name: " + t.getName() + ", State: " + t.getState());
        }
    }
}
