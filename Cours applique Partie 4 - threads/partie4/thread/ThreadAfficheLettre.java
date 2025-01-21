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
			cpt++;
			System.out.print(lettre);
			System.out.flush();
		}
	}

	public static void main(String[] args) throws Exception {
		
		Thread ta = new ThreadAfficheLettre('a', 200);		ta.start();
		Thread tb = new ThreadAfficheLettre('b', 200);		tb.start();
		
		
	}

}