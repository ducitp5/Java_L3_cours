package xii.BoiteDeDialogue;

import javax.swing.JDialog;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

@SuppressWarnings("serial")
class ZDialog extends JDialog {
	
	public ZDialog(JFrame parent, String title, boolean modal) {
		
		super(parent, title, modal);
		
		this.setSize(200, 80);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setVisible(true);
	}
}

@SuppressWarnings("serial")
class FenetreZDialog extends JFrame {
	
	JButton bouton = new JButton("Appel à la ZDialog");

	public FenetreZDialog() {
	
		this.setTitle("Ma JFrame");
		this.setSize(300, 100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.getContentPane().setLayout(new FlowLayout());
		this.setVisible(true);
		this.getContentPane().add(bouton);
		
		bouton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				new ZDialog(null, "Coucou les ZérOs", true);
			}
		});
	}

	public static void main(String[] args) {
		
		new FenetreZDialog();
	}
}