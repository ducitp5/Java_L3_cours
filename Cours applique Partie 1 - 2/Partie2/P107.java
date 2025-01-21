package Partie2;


import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class P107 {
	
	public static void main(String[] args) {

		GregorianCalendar gc = new GregorianCalendar(2011,Calendar.AUGUST,23,11,0,0);
		Date d = gc.getTime();
		System.out.println(d);
//		gc.setTime(new Date(nbMill_11_Aout_1999));
		System.out.println(gc.getTime());
	}

}
