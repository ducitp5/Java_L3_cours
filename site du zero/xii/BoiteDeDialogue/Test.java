package xii.BoiteDeDialogue;

import javax.swing.JOptionPane;

public class Test {

	static void test1() {
		
		String nom = JOptionPane.showInputDialog(
			null, 
			"votre identit� !", 
			"Gendarmerie nationale !",
			JOptionPane.QUESTION_MESSAGE
		);
		
		JOptionPane.showMessageDialog(
			null, 
			"Votre nom est " + nom, 
			"Identit�", 
			JOptionPane.ERROR_MESSAGE
		);

	}
	
	static void test2() {

		String[] sexe = { "masculin444", "f�minin", "ind�termin�" };
		
		String nom = (String) JOptionPane.showInputDialog(
			null, 
			"Veuillez d�cliner votre sexe !",
			"Gendarmerie nationale !", 
			JOptionPane.QUESTION_MESSAGE, 
			null, 
			sexe, 
			sexe[2]
		);
		
		JOptionPane.showMessageDialog(
			null, 
			"Votre sexe est " + nom, 
			"Etat civil", 
			JOptionPane.INFORMATION_MESSAGE
		);

	}
	
	public static void main(String[] args) {

//		test1();
		test2();
	}

}
