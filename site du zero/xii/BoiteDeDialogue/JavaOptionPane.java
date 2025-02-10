package xii.BoiteDeDialogue;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class JavaOptionPane {

	static void test1() {
		JOptionPane.showMessageDialog(null, "Message informatif", "Information", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Message préventif", "Attention", JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null, "Message d'erreur", "Erreur", JOptionPane.ERROR_MESSAGE);
	}
	
	static void test2() {

		ImageIcon img = new ImageIcon("images/information.png");
		
		JOptionPane.showMessageDialog(
			null,
			"Message informatif",
			"Information",
			JOptionPane.INFORMATION_MESSAGE, 
			img
		);
		
		img = new ImageIcon("images/warning.png");
		JOptionPane.showMessageDialog(
			null,
			"Message préventif", 
			"Attention",
			JOptionPane.WARNING_MESSAGE, 
			img
		);
		
		img = new ImageIcon("images/erreur.png");
		JOptionPane.showMessageDialog(
			null,
			"Message d'erreur", 
			"Erreur",
			JOptionPane.ERROR_MESSAGE, 
			img
		);
	}
	
	static void test3() {

		int i = 100, j = 0;
		try {
			System.out.println("Résultat = " + (i / j));
		} 
		catch (ArithmeticException ex) {
			JOptionPane.showMessageDialog(
				null, 
				ex.getMessage(), 
				"Erreur fatale ! ! ",
				JOptionPane.ERROR_MESSAGE
			);
			System.out.println("erreur est : " + ex.getMessage());
		}

	}

	public static void main(String[] args) {

//		test1();
//		test2();
		test3();
	}

}
