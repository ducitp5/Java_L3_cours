package partie4.thread;

import java.util.Date;

public class ThreadDate extends Thread {
	
	private int 	periode;
	private Date	dateLimite;

	/**
	 * crée un thread d'affichage de la date toutes les 'periode' secondes
	 * pendant 'duree' secondes
	 */
	
	public ThreadDate(int periode, int duree) {
	
		this.periode 		= periode;
		
		this.dateLimite 	= new Date(new Date().getTime() + duree * 1000);
	}

	/**
	 * le travail à effectuer par ce thread : affichage à intervalle régulier
	 * d'une date jusqu'à une date limite
	 */
	public void run() {
		
		boolean 	continuer = true;
		
		while (continuer) {
		
			Date 	dateActuelle = new Date();
			
			if (dateActuelle.after(dateLimite))			continuer = false;
	
			else {
				
				System.out.println("Il est " + dateActuelle);
				
				try {		Thread.sleep(periode * 1000);		} 
				
				catch (InterruptedException exp) {		exp.printStackTrace();		}
			}
		}
	}

	public static void main(String[] args) throws Exception {
		/**
		 * creation d'un thread permettant l'affichage toutes les 60 secondes de
		 * la date sur la sortie standard pendant 1 heure
		 */
		Thread threadDate 	= new ThreadDate(1 , 20);		threadDate.start();
		
		Thread t 			= new ThreadDate(12, 202);		t.start();
		
		/** demarrer ce thread */
					

	}

}