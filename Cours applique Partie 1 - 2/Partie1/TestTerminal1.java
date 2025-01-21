package Partie1;
import up5.mi.pary.term.Terminal;

public class TestTerminal1 {
	
	public static void main(String[] args) {

		Terminal term = new Terminal("calcul du carré de la somme",300,300);

		int a = term.readInt("donner un entier:") ;
		int b = term.readInt("donner un autre entier:") ;
		
		term.println("le carré de la somme de "+a+ " et de "+b+" vaut "+(a+b)*(a+b));
		
		term.end();
		
	}
}
