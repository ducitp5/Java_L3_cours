package Partie2;

import up5.mi.pary.jc.compte.CompteS;

public class P21 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		CompteS c1 = new CompteS("Dupond",200,1000);// un compte pour Dupond 
		CompteS c2 = new CompteS("Durand");// un compte pour Durand

		c1.addOperation(100);//100 de plus pour Dupond c1. addOperation(300);//300 de plus pour Dupond c2. addOperation(-50); //50 Euros de moins pour Durand c1. addOperation(-30); // 30 Euros de moins pour Dupond
		
		System.out.println("Solde de Dupond:"+c1.getSolde()); 
		System.out.println(c1.getHistorique()+c2.getHistorique()); System.out.print(" Le solde du compte de " + c1.getNomTitulaire( )+" est ");
		if (c1.isSoldeInsuffisant( ))
		System.out.println("insuffisant");
		else
		System.out.println("suffisant");
	}

}
