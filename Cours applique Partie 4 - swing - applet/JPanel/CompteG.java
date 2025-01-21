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


	//1 attribut priv� de classe constant: 
	//Un tableau de cha�nes pour l'affichage des moyens de paiement
	private static final String [ ] tMoyenPaiement ={"cb","vi","lq","ch"};



	/** construit un compte pour une personne
	 * nomm�e 'nomTitulaire' et avec un solde initial de 'versementInitial' 
	 * et un montant de d�couvert autoris� �gal � 'decouvertAutorise' */
	public CompteG(	String nomTitulaire, double versementInitial,	double decouvertAutorise){

		this.nomTitulaire=nomTitulaire;

		this.solde = 0;

		this.decouvertAutorise = 0;

		this.historique = new ArrayList<String>( );

//		this.addOperation(versementInitial,Compte.LIQUIDE);
		this.setDecouvertAutorise(decouvertAutorise);
	}

	/** construit un compte pour une personne
	 * nomm�e 'nomTitulaire'  sans versement initial
	 * et un montant de d�couvert autoris� �gal au montant de d�couvert autoris� par d�faut
	 */ 
	public CompteG(String nomTitulaire){
		this(nomTitulaire,0,CompteG.decouvertAutoriseParDefaut);
	}


	/** @return le decouvert autorise attribu� lors de la creation des comptes */
	public static double getDecouvertAutoriseParDefaut( ) {
		return CompteG.decouvertAutoriseParDefaut;
	}

	/** le decouvert autorise  pour ce compte devient �gal � 'decouvertAutorise'*/
	public static void setDecouvertAutoriseParDefaut(double decouvertAutoriseParDefaut) {
		CompteG.decouvertAutoriseParDefaut = decouvertAutoriseParDefaut;
	}


	/** enregistre une op�ration de 'montant' Euros 
	 * sur ce compte avec le 'moyenPaiement' indiqu� */
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
	/** @return le d�couvert autoris� de ce compte */
	public double getDecouvertAutorise( ) {
		return this.decouvertAutorise;
	}
	/** modifie le d�couvert autoris� de ce compte */
	public void setDecouvertAutorise( double decouvertAutorise) {
		this.decouvertAutorise=decouvertAutorise;
	}
	/** teste si le solde est insuffisant */
	public boolean isSoldeInsuffisant( ) {
		return this.solde < 0 ;
	}
	/** @return une cha�ne illustrant l'historique des op�rations sur ce compte */
	public String getHistorique( ) {
	    return this.historique.toString( );
	}


	public static CompteG load(String nom) {return new CompteG(nom);}

	public void save( ) {}
}