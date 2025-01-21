package test_individu;

import up5.mi.pary.jc.compte.Compte;

public class P50 {

	public static void main(String[] tArg) {
		
		Compte.setDecouvertAutoriseParDefaut(2000);
		
		Compte c1 = new Compte("Dupond",3000,4000);
		Compte c2 = new Compte("Durand");
		
		c1.addOperation(-4000,Compte.CHEQUE);
		c2.addOperation(-3500,Compte.LIQUIDE);
		
		System.out.println(c1.getNomTitulaire()+" "+c1.getSolde()+ " "+c1.getDecouvertAutorise());
		System.out.println(c2.getNomTitulaire()+" "+c2.getSolde()+ " "+c2.getDecouvertAutorise());
	
		System.out.println(Compte.getDecouvertAutoriseParDefaut( ));
		System.out.println(c1.getHistorique( )); }
}
