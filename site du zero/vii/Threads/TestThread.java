package vii.Threads;

public class TestThread extends Thread {
	
	public TestThread(String name) {
		super(name);
		System.out.println("Thread " + this.getName() + " in state : " + this.getState());
	}

	@Override
	public void run() {
		
		for (int i = 0; i < 10; i++)			System.out.print("\n run() - " +this.getName());
		
		System.out.println("\nrun() Thread " + this.getName() + " in state : " + this.getState() + " id :" + this.getId());
	}

	public static void main(String[] args) {
	
		System.out.println("Current thread : " + Thread.currentThread().getName());
		
		TestThread t = new TestThread("A");
		TestThread t2 = new TestThread(" B");
		
		t.start();
		t2.start();
		
		System.out.println("Current thread 2 : " + Thread.currentThread().getName());
		System.out.println("\n main Thread t" + t.getName() + " in state : " + t.getState());
		System.out.println("\n main Thread t2" + t2.getName() + " in state : " + t2.getState());
	}
}
