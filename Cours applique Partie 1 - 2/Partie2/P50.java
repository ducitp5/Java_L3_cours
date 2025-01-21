package Partie2;

import up5.mi.pary.jc.rationnel.Rationnel;

public class P50 {

	
	public static void main(String[] args) {

		Rationnel r1= new Rationnel(5,12);
		Rationnel r2 = new Rationnel(3,4);
//		Rationnel zero = new Rationnel(0);
		Rationnel s = r1.addition(r2);
		Rationnel p = r1.multiplication(r2);
		System.out.println(r1+"+"+r2+"="+s);
		System.out.println(r1+"*"+r2+"="+p);
	}

}
