package xii.BoiteDeDialogue.vii;

public class ZDialogInfo {

	String nom, sexe, age, cheveux, taille;

	public ZDialogInfo() {
	}

	public ZDialogInfo(String nom, String sexe, String age, String cheveux, String taille) {
		this.nom = nom;
		this.sexe = sexe;
		this.age = age;
		this.cheveux = cheveux;
		this.taille = taille;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getCheveux() {
		return cheveux;
	}

	public void setCheveux(String cheveux) {
		this.cheveux = cheveux;
	}

	public String getTaille() {
		return taille;
	}

	public void setTaille(String taille) {
		this.taille = taille;
	}

	public String toString() {

		String str;

		if (this.nom != null && this.sexe != null && this.taille != null && this.age != null && this.cheveux != null) {
			str = "Description de l'objet InfoZDialog";
			str += "Nom : " + this.nom + "\n";
			str += "Sexe : " + this.sexe + "\n";
			str += "Age : " + this.age + "\n";
			str += "Cheveux : " + this.cheveux + "\n";
			str += "Taille : " + this.taille + "\n";
		} else {
			str = "Aucune information !";
		}

		return str;
	}

}
