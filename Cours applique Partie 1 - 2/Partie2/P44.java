package Partie2;

import java.util.Date;

public class P44 {
	
	public static void main(String[] args) {

		long SecParMinute	=	1000 * 60;
		long SecParHeure	=	SecParMinute * 60;
		long SecParJour		=	SecParHeure  * 24;
		
		Date dateEclipse = new Date( (29*365 + 7) * SecParJour
								+ (31+28+31+30+31+30+31+10) * SecParJour
								+ 9 * SecParHeure  +  15 * SecParMinute);
	
		System.out.println("Eclipse:"+ dateEclipse);
	}

}
