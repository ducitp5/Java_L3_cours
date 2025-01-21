package compte_exceptions;

@SuppressWarnings("serial")
public class CompteVideException extends CompteException { 
	
	public CompteVideException(String s) { 
		
		super("Aucune opération enregistrée sur le compte: "+s);
		
	}

}