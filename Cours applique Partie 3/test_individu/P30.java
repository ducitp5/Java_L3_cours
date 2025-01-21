package test_individu;

import java.util.Calendar;
import java.util.Date;
import up5.mi.pary.jc.util.Individu;

import up5.mi.pary.jc.compte.CompteI;
import java.util.GregorianCalendar;
public class P30 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Date 		dateNaissanceDupond 	=	 new  GregorianCalendar(1989,Calendar.APRIL,6).getTime( );
		Individu 	dupond 					= 	 new Individu("Dupond","Sylvie", dateNaissanceDupond );
		
		CompteI 	compte				 	= 	 new CompteI(dupond);
		compte.addOperation(200);
		
		System.out.println(compte.getTitulaire( ));
		System.out.println(compte.getTitulaire( ).getAge( ));
		System.out.println(compte.getSolde( ));
	}

}
