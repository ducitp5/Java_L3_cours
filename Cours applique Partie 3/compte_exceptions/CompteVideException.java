package compte_exceptions;

@SuppressWarnings("serial")
public class CompteVideException extends CompteException { 
	
	public CompteVideException(String s) { 
		
		super("Aucune op�ration enregistr�e sur le compte: "+s);
		
	}

}