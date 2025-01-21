package ButtonGroup2;

import TestFenetreClick.Compteur;

public class CompteurPlus2 extends Compteur {

	private int defaultValue;

	/**
	 * cr�ation d'un compteur avec valeur initiale nulle et incrementeur �gal �
	 * 1
	 */
	public CompteurPlus2() {
		this.defaultValue = 3;
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