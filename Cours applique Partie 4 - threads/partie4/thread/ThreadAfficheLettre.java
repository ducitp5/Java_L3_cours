package partie4.thread;

public class ThreadAfficheLettre extends Thread {

	/** la lettre à afficher */
	private char lettre;
	
	/** le nombre d'affichage à effectuer */
	private int lim;
	
	/** le nombre d'affichage effectué */
	private int cpt = 0;

	/** crée un thread affichant 'lim' fois la lettre 'lettre' */
	public ThreadAfficheLettre(char lettre, int lim) {
	
		this.lettre = lettre;
		this.lim 	= lim;
	}

	/** le travail à effectuer par ce thread */
	public void run() {
		while (cpt <= lim) {

			System.out.println("ThreadAfficheLettre.run - " +this.lettre +" - " +Thread.currentThread().getId());

			cpt++;
			System.out.print(lettre);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.flush();
		}
	}

	public static void main(String[] args) throws Exception {
		
		System.out.println("ThreadAfficheLettre.main - " +Thread.currentThread().getId());

		Thread ta = new ThreadAfficheLettre('a', 2);		ta.start();
		Thread tb = new ThreadAfficheLettre('b', 5);		tb.start();
				
	}

}