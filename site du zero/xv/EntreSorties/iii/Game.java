package xv.EntreSorties.iii;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Game implements Serializable {
	String nom;
    transient String password; // This field won't be serializedpassword;
	double prix;
	Notice notice; 

	public Game(String nom, String pass, double prix) {
		this.nom = nom;
		this.password = pass;
		this.prix = prix;
		this.notice = new Notice();
	}

	@Override
	public String toString() {
		return "Nom du jeu : " + this.nom 
				+ "\npassword : " + this.password 
				+ "\nPrix du jeu : " + this.prix + "\n"
				+ "notice : " +this.notice.toString()
		;
	}
}
