package compte_exceptions;

@SuppressWarnings("serial")
public class DecouvertException extends CompteException { 
	
	public DecouvertException(double montant,CompteE c) {
		
		super(  "Depassement du d�couvert autorise : operation impossible \n"+ 
				"montant: "+montant+" solde:"+c.getSolde()+ " decouvert autorise :"+c.getDecouvertAutorise());}
}
