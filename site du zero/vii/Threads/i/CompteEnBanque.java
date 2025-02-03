package vii.Threads.i;

public class CompteEnBanque {
	
	int solde = 100;

	public int getSolde() {
		
		if (this.solde < 0)			System.out.println("Vous êtes à découvert!");
		
		return this.solde;
	}

	public void retraitArgent(int retrait) {
		
		solde = solde - retrait;
		
		System.out.println("Solde = " + solde);
	}

	public static void main(String[] args) {

		CompteEnBanque 	cb 	= new CompteEnBanque();
		
		Thread 			t 	= new Thread(new RunImpl(cb));
		t.start();
	}
}


class RunImpl implements Runnable {
	
	CompteEnBanque cb;

	public RunImpl(CompteEnBanque cb) {
		this.cb = cb;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			
			if (cb.getSolde() > 0) {
				cb.retraitArgent(2);
				System.out.println("Retrait effectué");
			}
		}
	}
}
