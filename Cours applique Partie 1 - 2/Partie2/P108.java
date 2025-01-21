package Partie2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class P108 {

	
	public static void main(String[] args) {

		GregorianCalendar d = new GregorianCalendar(1999,Calendar.AUGUST,11,11,15,0);
		
		System.out.println(" YEAR = "+ d.get(Calendar. YEAR ));
		System.out.println(" MONTH = "+ d.get(Calendar. MONTH ));
		System.out.println(" HOUR_OF_DAY = "+d.get(Calendar. HOUR_OF_DAY ));
		System.out.println(" MINUTE = "+d.get(Calendar. MINUTE ));
		System.out.println(" SECOND = "+d.get(Calendar. SECOND));
		System.out.println(" MILLISECOND = "+d.get(Calendar. MILLISECOND ));
	}

}
