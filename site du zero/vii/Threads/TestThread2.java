package vii.Threads;

public class TestThread2 extends Thread {

	Thread t;

	public TestThread2(String name) {
		
		super(name);
		System.out.println("statut du thread " + name + " =" + this.getState() + " main thread() = " +Thread.currentThread().getId());
		System.out.println("main thread " + name + " =" + this.getState());

		this.start();
		System.out.println("statut du thread apres start " + name + " =" + this.getState());
	}

	public TestThread2(String name, Thread t) {
		super(name);
		this.t = t;
		System.out.println("statut du thread " + name + " =" + this.getState()  + " main thread()2 = " +Thread.currentThread().getId());
		this.start();
		System.out.println("statut du thread apres start " + name + " =" + this.getState());
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("statut " + this.getName() + " = " + this.getState());
			if (t != null)
				System.out.println(
						"statut de " + t.getName() + " pendant le thread " + this.getName() + " = " + t.getState());
		}
	}

	public static void main(String[] args) {
		TestThread2 t = new TestThread2("A");
		TestThread2 t2 = new TestThread2(" B", t);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("statut fin " + t.getName() + " = " + t.getState());
		System.out.println("statut fin " + t2.getName() + " = " + t2.getState());
	}
}
