package JMenu;

import java.awt.Frame;

import javax.swing.JFrame;

import JPanel.PanelFamille;

public class JDialog {

	public JDialog (Frame frame, String title,boolean modal){
	
//	public static void main(String[] args) {
		
		// création d'une instance de JFileChooser
		javax.swing.JFileChooser hf = new javax.swing. JFileChooser( );
		// on indique ici le répertoire devant être proposé au départ
		hf.setCurrentDirectory(new java.io.File("java"));
		// On demande l'affichage de la fenêtre de dialogue
		hf.showOpenDialog(frame);// frame est la JFrame de l'application
		// l'appel précédent est bloquant :
		// l'instruction suivante est donc exécutée
		// quand l'utilisateur a fermé la fenêtre de dialogue
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
