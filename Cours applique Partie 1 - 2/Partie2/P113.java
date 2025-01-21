package Partie2;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class P113 {

	
	public static void main(String[] args) {

		Date dEcl = new GregorianCalendar(1999,Calendar.AUGUST,11,11,15,0).getTime();
		TimeZone tGMT = TimeZone.getDefault();

		System.out.print("Zone horaire1 : "+tGMT.getID());
		System.out.println(" d="+dEcl);
		
		TimeZone zoneHoraire = TimeZone.getTimeZone("Africa/Dakar");
		TimeZone.setDefault(zoneHoraire);
		
		System.out.print("Zone horaire2 : "+TimeZone.getDefault().getID());
		System.out.println(" d="+dEcl);
		
		TimeZone.setDefault(TimeZone.getTimeZone("Australia/Darwin"));
		
		System.out.print("Zone horaire3 : "+TimeZone.getDefault().getID());
		System.out.println(" d="+dEcl);
	}

}
