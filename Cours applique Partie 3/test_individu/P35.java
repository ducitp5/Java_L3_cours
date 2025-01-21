package test_individu;

import up5.mi.pary.jc.rationnel.Rationnel;

public class P35 {

	public static void main(String [ ] args) { 
		
		Rationnel r1 = new Rationnel(5,12);
	
		Rationnel r2 = new Rationnel(3,4);

		System.out.println(r1+"+"+r2+"="+r1.addition(r2)); 
		
		System.out.println(r1+"*"+r2+"="+r1.multiplication(r2));
	}
}
