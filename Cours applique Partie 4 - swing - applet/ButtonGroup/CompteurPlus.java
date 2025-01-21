package ButtonGroup;

import TestFenetreClick.Compteur;

public class CompteurPlus extends Compteur {

	private int defaultValue;

	/**
	 * cr�ation d'un compteur avec valeur initiale nulle et incrementeur �gal �
	 * 1
	 */
	public CompteurPlus() {
		this.defaultValue = 1;
	}

	/** incr�mentation de la valeur de ce compteur */
	public void incrementer() {
		incrementer(this.defaultValue);
	}

	/**
	 * la valeur d'incr�mentation du compteur lors des appels � la m�thode
	 * incrementer devient �gale � 'inc'
	 */
	public void setDefaultIncrValue(int value) {
		this.defaultValue = value;
	}
}