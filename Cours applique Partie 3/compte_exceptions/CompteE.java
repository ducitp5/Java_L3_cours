package compte_exceptions;

import java.util.List;
import java.util.ArrayList;

public class CompteE{
	
	private String nomTitulaire;
	private double solde;
	private List<Double> historique;
	private double decouvertAutorise;
	
	/** construit un compte pour une personne
	 * nommée 'nomTitulaire' sans versementInitial */
	public CompteE(String nomTitulaire) {
	    this.nomTitulaire=nomTitulaire;
	    this.solde = 0;
	    this.historique = new ArrayList<Double>();
	    this.decouvertAutorise = 0;
	}

	/** construit un compte pour une personne
	 * nommée 'nomTitulaire', avec un versement initial et un découvert autorisé spécifique */
	public CompteE(String nomTitulaire, double versementInitial, double decouvertAutorise) throws CompteException{ 
	   this(nomTitulaire);
	   this.addOperation(versementInitial);
	   this.setDecouvertAutorise(decouvertAutorise);
	}


	/** enregistre une opération de 'montant' Euros sur ce compte avec le 'moyenPaiement' indiqué
	   * @param montant le montant de l'opération
	   */
	public void addOperation(double montant) throws CompteException{
	  if (montant ==0)
		  throw new MontantNulException("Operation avec un montant nul !");
	  else if (montant+solde<-this.decouvertAutorise)
		  throw new DecouvertException(montant,this);
	    else{
	     this.historique.add(montant);
	     this.solde  = this.solde +  montant;
	     }
	}

	/** @return le découvert autorisé de ce compte */
	public double getDecouvertAutorise( ) {
	return this.decouvertAutorise;
	}
	/** @return une chaîne illustrant l'historique des opérations sur ce compte */
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
	/** modifie le découvert autorisé de ce compte */
	public void setDecouvertAutorise( double decouvertAutorise) {
	   this.decouvertAutorise=decouvertAutorise;
	}

	
}

