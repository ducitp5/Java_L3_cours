package ButtonGroup;

import TestFenetreClick.Compteur;

public class CompteurPlus extends Compteur {

	private int defaultValue;

	/**
	 * création d'un compteur avec valeur initiale nulle et incrementeur égal à
	 * 1
	 */
	public CompteurPlus() {
		this.defaultValue = 1;
	}

	/** incrémentation de la valeur de ce compteur */
	public void incrementer() {
		incrementer(this.defaultValue);
	}

	/**
	 * la valeur d'incrémentation du compteur lors des appels à la méthode
	 * incrementer devient égale à 'inc'
	 */
	public void setDefaultIncrValue(int value) {
		this.defaultValue = value;
	}
}