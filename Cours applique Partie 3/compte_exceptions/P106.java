package compte_exceptions;

import up5.mi.pary.term.Terminal;

public class P106 {

	public static void main(String[ ] args) throws CompteException { 
		
		Terminal term = new Terminal("Compte avec gestion d'exception",300,300);
		
		CompteE c1 = new CompteE("Dupond",200,0); 
		
		int choix; 
		
		do { 
			
			term.print("1:Credit \n2:Debit\n3:Solde\n4:Historique"); 
			
			do choix = term .readInt("");
			
			while ((choix<0)||(choix>4)); 
			
			try { 
				
				switch (choix) { 
				
					case 1: c1.addOperation(term.readDouble("montant ? "));break; 
					
					case 2: c1.addOperation(-term.readDouble ("montant ? "));break; 
					
					case 3: term .println("Solde= "+c1.getSolde());break; 
					
					case 4: term .println("Historique: "+c1.getHistorique());break;
					
				}
				
			} 
			
			catch (DecouvertException ex) {
				
				term .println("Operation ignoree : " + "compte non suffisamment approvisionné"+ex);
				
			} 
			
			catch (MontantNulException ex) {
				term .println(" Operation ignoree : entrer des nombres non nuls !");
				
			} 
			
			catch (CompteException ex) {
				
				ex.printStackTrace( ); 
				
			} 
			
		}	
	
		while (choix!=0);
	}
	
}

