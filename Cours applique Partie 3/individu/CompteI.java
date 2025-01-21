package individu;

import java.util.List;
import java.util.ArrayList;

import up5.mi.pary.jc.util.Individu;

public class CompteI{
	
	/** le titulaire de ce compte*/
	private Individu titulaire;
    private double solde;
	private List<Double> historique;
	private double decouvertAutorise;
	
	/** construit un compte pour une personne
	 * nomm�e 'nomTitulaire' sans versementInitial */
	public CompteI(Individu titulaire) {
	    this.titulaire=titulaire;
	    this.solde = 0;
	    this.historique = new ArrayList<Double>();
	    this.decouvertAutorise = 0;
	}

	/** construit un compte pour une personne
	 * nomm�e 'nomTitulaire', avec un versement initial et un d�couvert autoris� sp�cifique */
	public CompteI(Individu titulaire, double versementInitial, double decouvertAutorise){ 
	   this(titulaire);
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

	/** @return le nom du titulaire de ce compte */
	public String getNomTitulaire( ) {
	return this.titulaire.getNom();
	}
	/** @return le solde de ce compte */
	public double getSolde( ) {
	return this.solde;
	}
	/** retourne le titulaire de ce compte */
	public Individu getTitulaire( ) {
	     return this.titulaire;
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

