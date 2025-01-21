package rationnel;

import up5.mi.pary.jc.util.UtilMath;
/* pour la fonction pgcd */

public class Rationnel {
	private long num,den;

	/** créé un rationnel égal à l'entier 'num' */
	public Rationnel(long num){
		// appel du constructeur Rationnel(long num,long den)‏
		this(num,1); 
	}
	
	/** crée un Rationnel de numérateur 'n' et de dénominateur 'd' */
	public Rationnel(long num,long den){
		if (den==0) throw new ArithmeticException("dénominateur d'un rationnel nul");
		this.num=num;
		this.den=den;
		this.simplifier();
	}
	
	/** @return le rationnel somme de ce rationnel et de 'r'*/
	public  Rationnel addition(Rationnel r){
		Rationnel res = new Rationnel(this.num*r.den+r.num*this.den,this.den*r.den);
		return(res);
	}
	
	/** @return le rationnel produit de ce rationnel et de 'r' */
	public Rationnel multiplication(Rationnel r){
		Rationnel res = new Rationnel(this.num*r.num  ,  this.den*r.den);
		return(res);	
	}

	/**normalise ce rationnel en le mettant sous forme
	 * irréductible avec un dénominateur positif */
	private void simplifier(){
		if (this.num==0)
		{this.den=1;}
		else {  long  pgcd = 
				UtilMath.pgcd(Math.abs(this.num),Math.abs(this.den));
		this.num=this.num/pgcd;
		this.den=this.den/pgcd;
		if (this.den<0) {
			this.den= - this.den;
			this.num= - this.num;
		}
		}}

	/** @return une chaîne de caractères représentant ce rationnel avec la notation habituelle sous forme de fractions irréductibles */
	public String toString(){
		return(this.num+"/"+this.den);
	}

}
