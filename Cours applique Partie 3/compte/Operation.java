package compte;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Operation {

	private final static DateFormat dateformat = new SimpleDateFormat("dd/MM/yy HH':'mm");
	

	private final static DecimalFormat decimalformat = new DecimalFormat("###00.00");
	
	private double montant;
	
	/* la date de cette opération */
	private Date date;
	
	/** le commentaire associé à cette opération*/
	private String commentaire;
	
	/** création d'une opération à la date 'date' d'un montant de 'montant' avec le 'commentaire' associé*/
	
	public Operation(double montant,Date date,String commentaire) {
	
		this.montant=montant;
		this.date=date;
		this.commentaire=commentaire;
	}
	
	public String toString(){
	
		return dateformat.format(date)+" : "+decimalformat.format(montant)+" "+commentaire;
	}
}
