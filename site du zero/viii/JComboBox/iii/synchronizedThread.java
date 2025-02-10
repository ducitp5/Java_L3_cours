package viii.JComboBox.iii;

public class synchronizedThread {
	
	public static void main(String[] args) {
		
		SharedResource resource = new SharedResource();

		MyThread t1 = new MyThread(resource); // how to set name for thread here
		t1.setName("Thread-1");
		
		MyThread t2 = new MyThread(resource);
		t2.setName("Thread-2");

		t1.start();
		t2.start(); // Both threads will execute `printNumbers()` but one at a time
	}

}

class SharedResource {

	synchronized void printNumbers() { // Only one thread can access this method at a time

		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	void printNumbers2() {

		System.out.println("start - " +Thread.currentThread().getName() + " - " + Thread.currentThread().getId());

		synchronized (this) { // Lock only this block

			for (int i = 1; i <= 6; i++) {
				
				System.out.println(Thread.currentThread().getName() + " - " + i);

				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
		System.out.println("end -- " +Thread.currentThread().getName() + " - " + Thread.currentThread().getId());

	}
}

class MyThread extends Thread {

	SharedResource resource;

	MyThread(SharedResource resource) {

		this.resource = resource;
	}

	public void run() {
		
//		resource.printNumbers();
		resource.printNumbers2();
	}
}

