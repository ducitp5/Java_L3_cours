package compte_derive;

import java.util.List;
import java.util.ArrayList;

public class CompteB{
	
	private String nomTitulaire;
	private double solde;
	private List<Double> historique;
	
	/** construit un compte pour une personne
	 * nomm�e 'nomTitulaire' sans versementInitial */
	public CompteB(String nomTitulaire) {
	    this.nomTitulaire=nomTitulaire;
	    this.solde = 0;
	    this.historique = new ArrayList<Double>();
	}

	/** construit un compte pour une personne
	 * nomm�e 'nomTitulaire', avec un versement initial */
	public CompteB(String nomTitulaire, double versementInitial){ 
	   this(nomTitulaire);
	   this.addOperation(versementInitial);
	}


	/** enregistre une op�ration de 'montant' Euros sur ce compte
	 * cr�dite le compte si le montant est positif, d�bite sinon*/
	public void addOperation(double montant) {
		if (montant !=0){
			this.historique .add(new Double(montant));
			this.solde = this.solde + montant;
		}
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

	
	//noveaux m�thodes ajout�es  P94
	
	public int getNbOperation( ) { 
		
		return this.historique.size( );
		
	}
	
	public double getOperationNumero(int i) { 
		
		return this.historique.get(i).doubleValue( );
	}
	
	
	
}

