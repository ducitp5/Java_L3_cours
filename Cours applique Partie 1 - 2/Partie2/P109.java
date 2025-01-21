package Partie2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class P109 {

	public static void main(String[] args) {

		GregorianCalendar gc = new GregorianCalendar(2010,Calendar.OCTOBER,9,11,0,0);
		
		gc.add(Calendar.DATE,1);				System.out.println(gc.getTime());
		
		gc.add(Calendar. HOUR_OF_DAY,1);		System.out.println(gc.getTime());
		
		gc.add(Calendar.DATE,+30);				System.out.println(gc.getTime());
	
	}

}
