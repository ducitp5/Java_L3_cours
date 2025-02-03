package vii.Threads.ii;

public class CompteEnBanque {

	int solde = 25;

	public int getSolde() {

		if (this.solde < 0)
			System.out.println("Vous etes decouvert!" + " - " + Thread.currentThread().getName());

		return this.solde;
	}

	public void retraitArgent(int retrait, String username) {
		System.out.println("user = " +username +" - Solde = " + solde + " - " + Thread.currentThread().getName());

		solde = solde - retrait;
	}

	public static void run1() {
		
		CompteEnBanque 	cb 	= new CompteEnBanque();
		Thread 			t 	= new Thread(new RunImpl(cb, "Cysboy", 2));
		t.start();
		
		CompteEnBanque 	cb2	= new CompteEnBanque();
		Thread 			t2 	= new Thread(new RunImpl(cb2, "Z�rO", 3));
		t2.start();
		
	}
	
	public static void run2() {
		
		CompteEnBanque 	cb 	= new CompteEnBanque();
		RunImpl 		t 	= (new RunImpl(cb, "Cysboy",2));
		RunImpl 		t2 	= (new RunImpl(cb, "Zyc",5));
		
		t.start(); 
		t2.start();
	}
	
	public static void main(String[] args) {
		
//		run1();
		run2();
	}
}

class RunImpl extends Thread {
	CompteEnBanque 	cb;
	String 			name;
	int 			retrait;

	public RunImpl(CompteEnBanque cb, String name, int retrai) {
		this.cb 		= cb;
		this.name 		= name;
		this.retrait 	= retrai;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			if (cb.getSolde() > 0) {
				cb.retraitArgent(retrait, name);
				System.out.println(retrait +" Retrait effect par " + this.name + " - solde reste = " +cb.solde + " - " + Thread.currentThread().getName());
			}
		}
	}
}