package individu;

import java.util.ArrayList;
import java.util.List;


public class Compte {
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



	/** @return le decouvert autorise attribué lors de la creation des comptes */
	public static double getDecouvertAutoriseParDefaut( ) {
		return Compte.decouvertAutoriseParDefaut;
	}

	/** retourne la chaîne représentant l'opération bancaire avec son montant
et le moyen de paiement montant de l'opération */
	private static String getStringHisto(double montant,int moyenPaiement){
		return montant + "("+tMoyenPaiement[moyenPaiement]+")";
	}


	/** le decouvert autorise  pour ce compte devient égal à 'decouvertAutorise'*/
	public static void setDecouvertAutoriseParDefaut(double decouvertAutoriseParDefaut) {
		Compte.decouvertAutoriseParDefaut = decouvertAutoriseParDefaut;
	}

	/** construit un compte pour une personne
	 * nommée 'nomTitulaire'  sans versement initial
	 * et un montant de découvert autorisé égal au montant de découvert autorisé par défaut
	 */ 
	public Compte(String nomTitulaire){
		this(nomTitulaire,0,Compte.decouvertAutoriseParDefaut);
	}


	/** construit un compte pour une personne
	 * nommée 'nomTitulaire' et avec un solde initial de 'versementInitial' 
	 * et un montant de découvert autorisé égal à 'decouvertAutorise' */
	public Compte(	String nomTitulaire, 
			double versementInitial,
			double decouvertAutorise){

		this.nomTitulaire=nomTitulaire;

		this.solde = 0;

		this.decouvertAutorise = 0;

		this.historique = new ArrayList<String>( );

		this.addOperation(versementInitial,Compte.LIQUIDE);
		this.setDecouvertAutorise(decouvertAutorise);
	}
	/** enregistre une opération de 'montant' Euros 
	 * sur ce compte avec le 'moyenPaiement' indiqué */
	public void addOperation(double montant,int moyenPaiement){
		if (montant !=0){
			this.solde  = this.solde +  montant;
			this.historique.add(Compte.getStringHisto(montant,moyenPaiement));
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