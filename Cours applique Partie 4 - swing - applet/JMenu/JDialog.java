package JMenu;

import java.awt.Frame;

import javax.swing.JFrame;

import JPanel.PanelFamille;

public class JDialog {

	public JDialog (Frame frame, String title,boolean modal){
	
//	public static void main(String[] args) {
		
		// cr�ation d'une instance de JFileChooser
		javax.swing.JFileChooser hf = new javax.swing. JFileChooser( );
		// on indique ici le r�pertoire devant �tre propos� au d�part
		hf.setCurrentDirectory(new java.io.File("java"));
		// On demande l'affichage de la fen�tre de dialogue
		hf.showOpenDialog(frame);// frame est la JFrame de l'application
		// l'appel pr�c�dent est bloquant :
		// l'instruction suivante est donc ex�cut�e
		// quand l'utilisateur a ferm� la fen�tre de dialogue
		System.out.println(hf.getSelectedFile( ));
	}
//	}
	
	public static void main(String [ ] args) {
		String name="Dupond";
		JFrame frame = new JFrame(name);
		frame.setContentPane(null);
		frame.pack( );
		frame.setVisible(true);
		}

}
