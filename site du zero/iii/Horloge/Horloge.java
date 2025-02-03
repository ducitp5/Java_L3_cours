package iii.Horloge;

import java.util.Calendar;
import java.util.ArrayList;

public class Horloge implements Observable {
	
	private Calendar calendar;
	private String hour = "";
	private ArrayList<Observateur> listObservateur = new ArrayList<Observateur>();

	public	int $i = 0;
	
	public void run() {
	
		while (true) {
			
			this.calendar = Calendar.getInstance();
			
			this.hour = this.calendar.get(Calendar.HOUR_OF_DAY) 
					+ " : "
					+ (this.calendar.get(Calendar.MINUTE) < 10 ? 
						"0" + this.calendar.get(Calendar.MINUTE)
						: this.calendar.get(Calendar.MINUTE))
					+ " : " 
					+ (this.calendar.get(Calendar.SECOND) < 10 ? 
						"0" + this.calendar.get(Calendar.SECOND)
						: this.calendar.get(Calendar.SECOND));
			
			this.updateObservateur();

			System.out.println($i + " - " +listObservateur);
			
			try {
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			++$i;  // how to set breakpoint when $i = 5
		}
	}

	public void addObservateur(Observateur obs) {
		System.out.println("Horloge - addObservateur - " +hour + " - " +obs);

		this.listObservateur.add(obs);
	}

	public void delObservateur() {
//		this.listObservateur = new ArrayList<Observateur>();
	}

	public void updateObservateur() {
		
		for (Observateur obs : this.listObservateur) {
			obs.update(this.hour);
			
			System.out.println("Horloge - updateObservateur - " +hour + " - " +$i);
		}
	}
}