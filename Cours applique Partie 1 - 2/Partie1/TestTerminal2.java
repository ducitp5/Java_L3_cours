package Partie1;
import up5.mi.pary.term.Terminal;

public class TestTerminal2 {

	public static void main(String [] tArg) {
		Terminal term = new Terminal("calcul du carré de la somme",300,300);
/*		term.setBackground(java.awt.Color.blue);
		term.setTextAreaColor(new java.awt.Color(200,200,255));
		term.setButtonColor(new java.awt.Color(100,100,255));
		term.setButtonLabel("Valider votre saisie ici");
		term.setFontSize(20);
*/		int a = term.readInt("donner un 1 entier:") ;
		int b= term.readInt("donner un autre entier:") ;
		term.println("le carré de la somme de "+a+
		" et de "+b+" vaut "+(a+b)*(a+b));
		term.end();
		}
}
