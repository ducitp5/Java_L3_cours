package JPanel;

import java.util.ArrayList;
import java.util.List;

import compte_exceptions.CompteVideException;

import up5.mi.pary.jc.compte.Compte;
import up5.mi.pary.jc.compte.exception.CompteException;

public class CompteG {

	private String nomTitulaire;
	private double solde;
	private List<String> historique;
	private double decouvertAutorise;

	private static double decouvertAutoriseParDefaut = 0;


	//4 attributs publiques de classe constants: 
	//Les quatre moyens de paiement
	public static final int CB=0;
	public static final int VIREMENT=1;
	public static final int LIQUIDE=2;
	public static final int CHEQUE=3;


	//1 attribut privé de classe constant: 
	//Un tableau de chaînes pour l'affichage des moyens de paiement
	private static final String [ ] tMoyenPaiement ={"cb","vi","lq","ch"};



	/** construit un compte pour une personne
	 * nommée 'nomTitulaire' et avec un solde initial de 'versementInitial' 
	 * et un montant de découvert autorisé égal à 'decouvertAutorise' */
	public CompteG(	String nomTitulaire, double versementInitial,	double decouvertAutorise){

		this.nomTitulaire=nomTitulaire;

		this.solde = 0;

		this.decouvertAutorise = 0;

		this.historique = new ArrayList<String>( );

//		this.addOperation(versementInitial,Compte.LIQUIDE);
		this.setDecouvertAutorise(decouvertAutorise);
	}

	/** construit un compte pour une personne
	 * nommée 'nomTitulaire'  sans versement initial
	 * et un montant de découvert autorisé égal au montant de découvert autorisé par défaut
	 */ 
	public CompteG(String nomTitulaire){
		this(nomTitulaire,0,CompteG.decouvertAutoriseParDefaut);
	}


	/** @return le decouvert autorise attribué lors de la creation des comptes */
	public static double getDecouvertAutoriseParDefaut( ) {
		return CompteG.decouvertAutoriseParDefaut;
	}

	/** le decouvert autorise  pour ce compte devient égal à 'decouvertAutorise'*/
	public static void setDecouvertAutoriseParDefaut(double decouvertAutoriseParDefaut) {
		CompteG.decouvertAutoriseParDefaut = decouvertAutoriseParDefaut;
	}


	/** enregistre une opération de 'montant' Euros 
	 * sur ce compte avec le 'moyenPaiement' indiqué */
	public void addOperation(double montant){
		if (montant !=0){
			this.solde  = this.solde +  montant;
//			this.historique.add(montant);
		}
	}
	

	/** @return le nom du titulaire de ce compte */
	public String getNomTitulaire( ) {
		return this.nomTitulaire;
	}
	/** @return le solde de ce compte */
	public double getSolde( ) {
		return this.solde;
	}
	/** @return le découvert autorisé de ce compte */
	public double getDecouvertAutorise( ) {
		return this.decouvertAutorise;
	}
	/** modifie le découvert autorisé de ce compte */
	public void setDecouvertAutorise( double decouvertAutorise) {
		this.decouvertAutorise=decouvertAutorise;
	}
	/** teste si le solde est insuffisant */
	public boolean isSoldeInsuffisant( ) {
		return this.solde < 0 ;
	}
	/** @return une chaîne illustrant l'historique des opérations sur ce compte */
	public String getHistorique( ) {
	    return this.historique.toString( );
	}


	public static CompteG load(String nom) {return new CompteG(nom);}

	public void save( ) {}
}