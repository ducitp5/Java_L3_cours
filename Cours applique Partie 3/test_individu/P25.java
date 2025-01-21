package test_individu;

import up5.mi.pary.jc.util.Individu;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class P25 {

	
	public static void main(String[] args) {

		Date 		d1	 =	 new GregorianCalendar(1989,Calendar.APRIL,6).getTime( );
		Individu 	i1	 =	 new Individu("Dupond","Sylvie",d1);
		
		Date 		d2	 =	 new GregorianCalendar(1989,Calendar.MAY,6).getTime( );
		Individu 	i2	 =	 new Individu("Durand","Claire",d2);
		
		System.out.println(new Date( ));
		System.out.println(i1+" "+i1.getAge());
		System.out.println(i2+" "+i2.getAge());

	}

}
