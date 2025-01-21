package compte_derive;

public class CompteCO extends CompteB {
	  private double montantDerniereOperation=0;

	/** construit un compte pour 'nomTitulaire' avec un 'versementInitial' */ 
	public CompteCO(String nomTitulaire,double versementInitial) {
	     super(nomTitulaire,versementInitial);
	     }

	 /**  ajoute une op�ration de 'montant' euros*/ 
	public void addOperation(double montant){
	     this.montantDerniereOperation=montant;
	     super.addOperation(montant);
	     }

	 /** rend le montant de la derni�re op�ration*/ 
	public double getDerniereOperation(){
	     return this.montantDerniereOperation;
	     }
	 }
