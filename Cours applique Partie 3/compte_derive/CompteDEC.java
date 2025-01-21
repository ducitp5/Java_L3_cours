package compte_derive;

public class CompteDEC extends CompteB {
	  private double decouvertAutorise;

	 /** créé un compte pour 'nomTitulaire' avec un 'versementInitial' et un 'decouvertAutorise'*/
	 public CompteDEC(String nomTitulaire,double versementInitial,double decouvertAutorise) {

		 super(nomTitulaire,versementInitial);
	     
		 this.decouvertAutorise=decouvertAutorise;
	 }

	 /** rend le débit maximum possible pour rester avec un solde suffisant */
	 public double getDebitPossible(){
	 
		 double res= this.getSolde()+this.decouvertAutorise;
	     if (res>=0) return res; else return 0;
	 }

	/** teste si le solde de ce compte est insuffisant */
	  public boolean isSoldeInsuffisant() {
		  return this.getSolde() < - this.decouvertAutorise;
		  
	  }

	}
