package compte_derive;

public class CompteNH extends CompteB2 {

	/** construit un compte pour 'nomTitulaire' avec un 'versementInitial' */ 
	public CompteNH(String nomTitulaire) {
		super(nomTitulaire);
	}

	
	/** rend un historique des 'n' dernières opérations effectuées sur ce compte*/
	public String getDerniereOperation(int n){

		int nbOp= this.getNbOperation();
	
		if (nbOp<n) n=nbOp;
	
		StringBuffer sb = new StringBuffer();
	
		for (int i=0;i<n;i++)
	
			sb.append(" "+this.getOperationNumero(nbOp-i-1));
	
		return sb.toString();
	}
	
	

}
