package xii.BoiteDeDialogue.vii;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class Fenetre extends JFrame {

	public Fenetre() {

		this.setTitle("Ma JFrame");
		this.setSize(300, 100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.getContentPane().setLayout(new FlowLayout());

		JButton bouton = new JButton("Appel à la ZDialog");

		this.getContentPane().add(bouton);

		bouton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				ZDialog zd = new ZDialog(null, "Coucou les ZérOs", true);

				ZDialogInfo zInfo = zd.showZDialog();

				JOptionPane.showMessageDialog(null, zInfo.toString(), "Informations personnage",
						JOptionPane.INFORMATION_MESSAGE);
			}
		});
		this.setVisible(true);
	}

	public static void main(String[] main) {
		new Fenetre();
	}
}