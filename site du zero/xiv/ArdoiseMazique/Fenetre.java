package xiv.ArdoiseMazique;

import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import java.awt.event.ActionListener;
import javax.swing.JMenu;
import java.awt.event.InputEvent;
import javax.swing.JMenuItem;
import java.awt.event.KeyEvent;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;

@SuppressWarnings("serial")
public class Fenetre extends JFrame {

	JMenuBar 	menuBar = new JMenuBar();
	JMenu 		fichier = new JMenu("Fichier");
	JMenuItem 	effacer = new JMenuItem("Effacer"), 
				quitter = new JMenuItem("Quitter");
	JMenu 		edition = new JMenu("Edition");
	JMenu 		forme 	= new JMenu("Forme du pointeur");
	JMenuItem 	rond 	= new JMenuItem("Rond"), 
				carre 	= new JMenuItem("Carré");
	JMenu 		couleur = new JMenu("Couleur du pointeur");
	JMenuItem 	rouge 	= new JMenuItem("Rouge"), 
				vert 	= new JMenuItem("Vert"), 
				bleu 	= new JMenuItem("Bleu");

	// LA BARRE D'OUTILS
	// ****************************************
	
	JToolBar 	toolBar = new JToolBar();
	JButton 	square 	= new JButton("vuong"), 
				circle 	= new JButton("tron"),
			// red = new JButton(new ImageIcon("images/rouge.jpg")),
				red 	= new JButton("do"), green = new JButton("lacay"), blue = new JButton("xanh");
	// ***************************************
	// LES ÉCOUTEURS
	// ***************************************
	
	FormeListener 	fListener = new FormeListener();
	CouleurListener cListener = new CouleurListener();
	DrawPanel 		drawPanel = new DrawPanel();

	public Fenetre() {
		
		this.setSize(700, 500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		{ // initMenu
			this.setJMenuBar(menuBar);
			menuBar.add(fichier);
			fichier.add(effacer);
			fichier.addSeparator();
			fichier.add(quitter);
			// Alt + F fichier.setMnemonic('F');
			menuBar.add(edition);
			edition.add(forme);
			forme.add(rond);
			forme.add(carre);
			edition.addSeparator();
			edition.add(couleur);
			couleur.add(rouge);
			couleur.add(vert);
			couleur.add(bleu);
			edition.setMnemonic('E'); // Alt + E
			effacer.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent arg0) {
					drawPanel.erase();
				}
			});
			effacer.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
			quitter.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent arg0) {
					System.exit(0);
				}
			});
			quitter.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, InputEvent.CTRL_DOWN_MASK));
			carre.addActionListener(fListener);
			rond.addActionListener(fListener);
			rouge.addActionListener(cListener);
			vert.addActionListener(cListener);
			bleu.addActionListener(cListener);
		}
		{
			this.getContentPane().add(toolBar, BorderLayout.NORTH);
			toolBar.add(square);
			square.addActionListener(fListener);
			toolBar.add(circle);
			circle.addActionListener(fListener);
			toolBar.addSeparator();
			toolBar.add(red);
			red.addActionListener(cListener);
			toolBar.add(green);
			green.addActionListener(cListener);
			toolBar.add(blue);
			blue.addActionListener(cListener);
		}
		this.getContentPane().add(drawPanel, BorderLayout.CENTER);
		this.setVisible(true);
	}

	class FormeListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource().getClass().getName() // Chon forme tu menu
					.equals("javax.swing.JMenuItem")) {
				if (e.getSource() == carre)
					drawPanel.setPointerType("SQUARE");
				else
					drawPanel.setPointerType("CIRCLE");
			} else { // Chon forme tu button o toolbar
				if (e.getSource() == square)
					drawPanel.setPointerType("SQUARE");
				else
					drawPanel.setPointerType("CIRCLE");
			}
		}
	}

	class CouleurListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource().getClass().getName().equals("javax.swing.JMenuItem")) { // lay tu menu
				if (e.getSource() == vert)
					drawPanel.setPointerColor(Color.green);
				else if (e.getSource() == bleu)
					drawPanel.setPointerColor(Color.blue);
				else
					drawPanel.setPointerColor(Color.red);
			} else { // lay tu button o toolbar
				if (e.getSource() == green)
					drawPanel.setPointerColor(Color.green);

				else if (e.getSource() == blue)
					drawPanel.setPointerColor(Color.blue);
				else
					drawPanel.setPointerColor(Color.red);
			}
		}
	}

	public static void main(String[] args) {
		new Fenetre();
	}
}
