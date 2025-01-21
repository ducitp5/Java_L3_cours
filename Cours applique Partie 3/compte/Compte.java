package compte;

import java.util.ArrayList;
import java.util.Date;
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


	//1 attribut priv� de classe constant: 
	//Un tableau de cha�nes pour l'affichage des moyens de paiement
	private static final String [ ] tMoyenPaiement ={"cb","vi","lq","ch"};


	/** construit un compte pour une personne
	 * nomm�e 'nomTitulaire'  sans versement initial
	 * et un montant de d�couvert autoris� �gal au montant de d�couvert autoris� par d�faut
	 */ 
	public Compte(String nomTitulaire){
		this(nomTitulaire,0,Compte.decouvertAutoriseParDefaut);
	}


	/** construit un compte pour une personne
	 * nomm�e 'nomTitulaire' et avec un solde initial de 'versementInitial' 
	 * et un montant de d�couvert autoris� �gal � 'decouvertAutorise' */
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
	
	/** @return le decouvert autorise attribu� lors de la creation des comptes */
	public static double getDecouvertAutoriseParDefaut( ) {
		return Compte.decouvertAutoriseParDefaut;
	}

	/** retourne la cha�ne repr�sentant l'op�ration bancaire avec son montant
et le moyen de paiement montant de l'op�ration */
	private static String getStringHisto(double montant,int moyenPaiement){
		return montant + "("+tMoyenPaiement[moyenPaiement]+")";
	}


	/** le decouvert autorise  pour ce compte devient �gal � 'decouvertAutorise'*/
	public static void setDecouvertAutoriseParDefaut(double decouvertAutoriseParDefaut) {
		Compte.decouvertAutoriseParDefaut = decouvertAutoriseParDefaut;
	}

	/** enregistre une op�ration de 'montant' Euros 
	 * sur ce compte avec le 'moyenPaiement' indiqu� */
	public void addOperation(double montant,int moyenPaiement){
		if (montant !=0){
			this.solde  = this.solde +  montant;
			this.historique.add(Compte.getStringHisto(montant,moyenPaiement));
		}
	}

	
	/** @return le d�couvert autoris� de ce compte */
	public double getDecouvertAutorise( ) {
		return this.decouvertAutorise;
	}
	/** @return une cha�ne illustrant l'historique des op�rations sur ce compte */
/*	public String getHistorique( ) {
	    return this.historique.toString( );
	}
*/
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

	
	//nouveaux m�thode ajout�
	public void addOperation(double montant,Date date,String commentaire) {
			
		this.historique.add(new Operation(montant,date,commentaire).toString()); 
			
		this.solde = this.solde + montant;
	}
	/** ajoute une op�ration � la date courante d'un montant de 'montant' Euros sur ce compte
	* @param montant le montant de l'op�ration */
	//nouveaux m�thode ajout�
	public void addOperation(double montant) {

		this.addOperation(montant,new Date(),"");
	}
		
	//nouveaux m�thode modifi�
	public String getHistorique() {

		String res="";
		
		// il serait mieux d'utiliser java.lang.StringBuffer
		for (int i=0;i<this.historique.size();i++)
		res+=this.historique.get(i)+"\n";
		return(res);
		}
		
	public String toString(){
	
		return("Compte n� "+this.solde+ " "+this.nomTitulaire);
	}

}