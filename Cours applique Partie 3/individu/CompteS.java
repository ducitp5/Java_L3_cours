package individu;

import java.util.List;
import java.util.ArrayList;

public class CompteS{
	
	private String nomTitulaire;
	private double solde;
	private List<Double> historique;
	private double decouvertAutorise;
	
	/** construit un compte pour une personne
	 * nomm�e 'nomTitulaire' sans versementInitial */
	public CompteS(String nomTitulaire) {
	    this.nomTitulaire=nomTitulaire;
	    this.solde = 0;
	    this.historique = new ArrayList<Double>();
	    this.decouvertAutorise = 0;
	}

	/** construit un compte pour une personne
	 * nomm�e 'nomTitulaire', avec un versement initial et un d�couvert autoris� sp�cifique */
	public CompteS(String nomTitulaire, double versementInitial, double decouvertAutorise){ 
	   this(nomTitulaire);
	   this.addOperation(versementInitial);
	   this.setDecouvertAutorise(decouvertAutorise);
	}


	/** enregistre une op�ration de 'montant' Euros sur ce compte
	 * cr�dite le compte si le montant est positif, d�bite sinon*/
	public void addOperation(double montant) {
		if (montant !=0){
			this.historique .add(new Double(montant));
			this.solde = this.solde + montant;
		}
	}

	/** @return le d�couvert autoris� de ce compte */
	public double getDecouvertAutorise( ) {
	return this.decouvertAutorise;
	}
	/** @return une cha�ne illustrant l'historique des op�rations sur ce compte */
	public String getHistorique( ) {
	    return this.historique.toString( );
	}
	/** @return le nom du titulaire de ce compte */
	public String getNomTitulaire( ) {
	return this.nomTitulaire;
	}
	/** @return le solde de ce compte */
	public double getSolde( ) {
	return this.solde;
	}
	/** teste si le solde est insuffisant */
	public boolean isSoldeInsuffisant( ) {
	return this.solde < 0 ;
	}

	/** modifie le d�couvert autoris� de ce compte */
	public void setDecouvertAutorise( double decouvertAutorise) {
	   this.decouvertAutorise=decouvertAutorise;
	}

}

