package compte_derive;

import java.util.List;
import java.util.ArrayList;

public class CompteB2{
	
	private String nomTitulaire;
	private double solde;
	private List<Double> historique;
	
	/** construit un compte pour une personne
	 * nommée 'nomTitulaire' sans versementInitial */
	public CompteB2(String nomTitulaire) {
	    this.nomTitulaire=nomTitulaire;
	    this.solde = 0;
	    this.historique = new ArrayList<Double>();
	}

	/** construit un compte pour une personne
	 * nommée 'nomTitulaire', avec un versement initial */
	public CompteB2(String nomTitulaire, double versementInitial){ 
	   this(nomTitulaire);
	   this.addOperation(versementInitial);
	}


	/** enregistre une opération de 'montant' Euros sur ce compte
	 * crédite le compte si le montant est positif, débite sinon*/
	public void addOperation(double montant) {
		if (montant !=0){
			this.historique .add(new Double(montant));
			this.solde = this.solde + montant;
		}
	}

	/** @return une chaîne illustrant l'historique des opérations sur ce compte */
	public String getHistorique( ) {
	    return this.historique.toString( );
	}
	public int getNbOperation( ) {
		return this.historique.size( );
		}

	/** @return le nom du titulaire de ce compte */
	public String getNomTitulaire( ) {
	return this.nomTitulaire;
	}
	
	public double getOperationNumero(int i) {
	return this.historique.get(i).doubleValue( );
	}


	/** @return le solde de ce compte */
	public double getSolde( ) {
	return this.solde;
	}
	
	    /** teste si le solde est insuffisant */
		public boolean isSoldeInsuffisant( ) {
		return this.solde < 0 ;
		}

}


