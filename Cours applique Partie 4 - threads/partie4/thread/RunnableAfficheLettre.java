package partie4.thread;

public class RunnableAfficheLettre implements Runnable {

	private char lettre;
	private int lim, cpt = 0;

	public RunnableAfficheLettre(char lettre, int lim) {
		
		this.lettre = lettre;
		this.lim 	= lim;
	}

	/** le travail à effectuer */
	public void run() {
		
		while (cpt <= lim) {
			
			cpt++;
			System.out.print(lettre);			System.out.flush();
		}
	}

	public static void main(String[] args) throws Exception {

		Thread ta = new ThreadAfficheLettre('a', 30);		ta.start();

		Thread tb = new ThreadAfficheLettre('b', 20);		tb.start();

		ta.join();
		tb.join();

		System.out.println("fin");

		Runnable ra = new RunnableAfficheLettre('c', 30);
		Runnable rb = new RunnableAfficheLettre('d', 40);
	
		Thread tha = new Thread(ra);		tha.start();
		
		Thread thb = new Thread(rb);		thb.start();

	}
}