package viii.JComboBox.iii;

import vii.Threads.iv.ThreadLister;

class Worker implements ThreadLister {

	public void listThread() {
		listThreads3();
	}
	
	synchronized void doWork() {
	      
		String $currentThread = Thread.currentThread().getName();

		try {
			System.out.println("before wait in " +$currentThread);
			listThread();

		    if($currentThread == "Thread-1") wait(); // Releases the lock and waits
			System.out.println("after wait in " +$currentThread);
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}

		listThread();
	}

	synchronized void resumeWork() {
		
		String $currentThread = Thread.currentThread().getName();
		System.out.println("before wait in " +$currentThread);

		notify(); // Wakes up a waiting thread
		listThread();
		System.out.println($currentThread + " resumed work!");

	}
}

public class WaitNotifyExample {

	public static void main(String[] args) throws InterruptedException {

		Worker worker = new Worker();

		Thread t1 = new Thread(
				
			() -> worker.doWork(), 
			"Thread-1"
		);
		Thread t11 = new Thread(
				
			() -> worker.doWork(), 
			"Thread-11"
		);
		
		Thread t2 = new Thread(
			() -> {
				try {
					Thread.sleep(2000);
					
				} 
				catch (InterruptedException e) { }
	
				worker.resumeWork();
			}, 
			"Thread-2"
		);
		
		t1.start();
//		t11.start();

		t2.start();
	}
}
