package partie4.thread;

public class CustomThread extends Thread {
	
    private boolean running = false;
    private boolean paused = false;

    @Override
    public void run() {
    	
        running = true;
        
        while (running) {
        
        	if (!paused) {
                // Perform some work
                System.out.println("Thread is running...");
            }
        	
            try {
                Thread.sleep(500); // Simulate work
            } 
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void pauseThread() {
        paused = true;
    }

    public void resumeThread() {
        paused = false;
    }

    public void stopThread() {
        running = false;
    }

    public boolean isRunning() {
        return running;
    }

    public boolean isPaused() {
        return paused;
    }
    
    public static void main(String[] args) throws InterruptedException {
    	
        CustomThread thread = new CustomThread();
        thread.start();

        Thread.sleep(1000); // Let the thread run for a while
        thread.pauseThread();
        System.out.println("Thread paused: " + thread.isPaused());

        Thread.sleep(1000); // Let the thread stay paused
        thread.resumeThread();
        System.out.println("Thread resumed: " + !thread.isPaused());

        Thread.sleep(1000); // Let the thread run again
        thread.stopThread();
        System.out.println("Thread stopped: " + !thread.isRunning());
    }
}
