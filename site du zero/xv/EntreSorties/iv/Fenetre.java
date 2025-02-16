package xv.EntreSorties.iv;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;

@SuppressWarnings("serial")
class Fenetre extends JFrame {
	
	String			title 			= "IV FenetreCpl";
	JMenuBar	 	menuBar 		= new JMenuBar();
	JMenu 			fichier 		= new JMenu("Fichier");
	JMenuItem 		effacer 		= new JMenuItem("Nouveau"), 	
					enregistrer 	= new JMenuItem("Enregistrer"),
					enregistrerSous = new JMenuItem("Enregistrer Sous"), ouvrir = new JMenuItem("Ouvrir"),
					quitter 		= new JMenuItem("Quitter");
	JMenu 			edition 		= new JMenu("Edition");
	JMenu 			forme 			= new JMenu("Forme du pointeur");
	JMenuItem 		rond 			= new JMenuItem("Rond"), 
					carre 			= new JMenuItem("Carré");
	JMenu 			couleur 		= new JMenu("Couleur du pointeur");
	JMenuItem 		rouge 			= new JMenuItem("Rouge"), 
					vert 			= new JMenuItem("Vert"), 
					bleu 			= new JMenuItem("Bleu");
	JToolBar 		toolBar 		= new JToolBar();

	JButton 		square 			= new JButton("vuong"), 
					circle 			= new JButton("tron"), 
					red 			= new JButton("do"),
					green 			= new JButton("lacay"), 
					blue 			= new JButton("xanh");
	JTextField 		sizefield		= new JTextField(2);
	DrawPanel 		drawPanel 		= new DrawPanel();
	JFileChooser 	fileChooser 	= new JFileChooser("backup/");
	ZFileFilter 	zFiltre 		= new ZFileFilter();
	ZFileFilter 	filtre 			= new ZFileFilter(".amz", "Fichier Ardoise Mazique");
	File 			file;
		
	public Fenetre() {
		
		this.setTitle(title);
		this.setSize(700, 500);
		this.setLocationRelativeTo(null);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// On ajoute nos filtres sur l'objet !
		this.fileChooser.addChoosableFileFilter(zFiltre);
		this.fileChooser.addChoosableFileFilter(filtre);
		
		{ // initMenu
			this.setJMenuBar(menuBar);
			menuBar.add(fichier);
			fichier.add(ouvrir); 
			ouvrir.addActionListener(new OuvrirListener());
			
			ouvrir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK));
			
			fichier.add(effacer);
			effacer.addActionListener(new EffaceListener());
			effacer.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
			fichier.addSeparator();
			fichier.add(enregistrer);
			enregistrer.addActionListener(new EnregistreListener());
			enregistrer.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));
			fichier.add(enregistrerSous);
			enregistrerSous.addActionListener(new EnreggistresousListener());
			enregistrerSous.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK + InputEvent.SHIFT_DOWN_MASK));
			fichier.addSeparator();
			fichier.add(quitter);
			quitter.addActionListener(new CloseListener());
			quitter.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, InputEvent.CTRL_DOWN_MASK));
			fichier.setMnemonic('F'); // Alt + F
			menuBar.add(edition);

			edition.add(forme);
			forme.add(rond);
			rond.addActionListener(new FormeListener());
			forme.add(carre);
			carre.addActionListener(new FormeListener());
			edition.addSeparator();
			edition.add(couleur);
			couleur.add(rouge);
			rouge.addActionListener(new CouleurListener());
			couleur.add(vert);
			vert.addActionListener(new CouleurListener());
			couleur.add(bleu);
			bleu.addActionListener(new CouleurListener());
			edition.setMnemonic('E'); // Alt + E
		}
		{ // initToolBar()
			this.getContentPane().add(toolBar, BorderLayout.NORTH);
			toolBar.add(square);
			square.addActionListener(new FormeListener());
			toolBar.add(circle);
			circle.addActionListener(new FormeListener());
			toolBar.addSeparator(new Dimension(30, 0));
			toolBar.add(red);
			red.addActionListener(new CouleurListener());
			toolBar.add(green);
			green.addActionListener(new CouleurListener());
			toolBar.add(blue);
			blue.addActionListener(new CouleurListener());
			toolBar.addSeparator(new Dimension(30, 0));
			toolBar.add(sizefield);
			sizefield.addActionListener(new SizeListener());
		}
		this.getContentPane().add(drawPanel, BorderLayout.CENTER);
		this.setVisible(true);
	}

	class SizeListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			drawPanel.pointerSize = Integer.parseInt(sizefield.getText());
		}
	}

	class OuvrirListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
 
			if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {

				file = fileChooser.getSelectedFile();

				System.out.println("file - " +file.toString());
				
				if (fileChooser.getFileFilter().accept(file)) {
 
					try {

						ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));

						drawPanel.setPoints((ArrayList<Point>) ois.readObject());

						ois.close();
						
	                    setTitle(title +" - " + file.getName()); // Update title with file name
					}
					catch (IOException e1) { e1.printStackTrace(); }
					catch (ClassNotFoundException e2) { e2.printStackTrace(); }
				}
				else {
					JOptionPane.showMessageDialog(
						null, 
						"Erreur d'extension de fichier !\nVotre chargement a échoué !",
						"Erreur", 
						JOptionPane.ERROR_MESSAGE
					);
				}
			}
		}
	}

	class EffaceListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			drawPanel.erase();
		}
	}

	class CloseListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}

	class EnregistreListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {

			ObjectOutputStream oos;

			if (file != null) { // S'il ne s'agit pas du premier enregistrement !
	 
				try {
					oos = new ObjectOutputStream(new FileOutputStream(file));
					oos.writeObject(drawPanel.points);
					oos.close();
				} 
				catch (IOException e) {
					e.printStackTrace();
				}
			} 
			else { // Sinon on demande le nom du fichier
				if (fileChooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
					
					file = fileChooser.getSelectedFile();
					// Si l'extension est valide
					if (fileChooser.getFileFilter().accept(file)) {
						try {
							oos = new ObjectOutputStream(new FileOutputStream(file));
							oos.writeObject(drawPanel.points);
							oos.close();
						} 
						catch (IOException e) {
							e.printStackTrace();
						}
					} 
					else { // Si vous n'avez pas spécifié une extension valide !
						JOptionPane.showMessageDialog(
							null,
							"Erreur d'extension de fichier !\n Votre sauvegarde a échoué !", 
							"Erreur",
							JOptionPane.ERROR_MESSAGE
						);
					}
				}
			}
		}
	}

	class EnreggistresousListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			if (fileChooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
				
				file = fileChooser.getSelectedFile();
			
				if (fileChooser.getFileFilter().accept(file)) {
					try {
						ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
						oos.writeObject(drawPanel.points);
						oos.close();
					} 
					catch (IOException e) {
						e.printStackTrace();
					}
				} 
				else {
					JOptionPane.showMessageDialog(
						null, 
						"Erreur d'extension de fichier !\nVotre sauvegarde a échoué !",
						"Erreur", 
						JOptionPane.ERROR_MESSAGE
					);
				}
			}
		}
	}

	class FormeListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			
			System.out.println("e.getSource() :" + e.getSource());
			
			if (e.getSource().getClass().getName().equals("javax.swing.JMenuItem")) {
			
				if (e.getSource() == carre)
					drawPanel.pointerType = ("SQUARE");
				else
					drawPanel.pointerType = ("CIRCLE");
			} 
			else { // Chon forme tu button o toolbar
				if (e.getSource() == square)
					drawPanel.pointerType = ("SQUARE");
				else
					drawPanel.pointerType = ("CIRCLE");
			}
		}
	}

	class CouleurListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			
			System.out.println(e.getSource().getClass().getName());
			
			if (e.getSource().getClass().getName().equals("javax.swing.JMenuItem")) {
				if (e.getSource() == vert)
					drawPanel.pointerColor = Color.green;
				else if (e.getSource() == bleu)
					drawPanel.pointerColor = Color.blue;
				else
					drawPanel.pointerColor = (Color.red);
			} 
			else { // lay tu button o toolbar
				if (e.getSource() == green)
					drawPanel.pointerColor = (Color.green);
				else if (e.getSource() == blue)
					drawPanel.pointerColor = Color.blue;
				else
					drawPanel.pointerColor = (Color.red);
			}
		}
	}

	public static void main(String[] args) {
		new Fenetre();
	}
}