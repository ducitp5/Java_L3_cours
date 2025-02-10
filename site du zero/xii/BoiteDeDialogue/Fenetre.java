package xii.BoiteDeDialogue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import ix.JCheckBox.iii.Panneau;
import xii.BoiteDeDialogue.Fenetre.PlayAnimation;

@SuppressWarnings("serial")
public class Fenetre extends JFrame {
	
	Panneau 	pan 		= new Panneau();
	JButton 	btGo 		= new JButton("Goo"), 
				btStop 		= new JButton("Stop");
	JLabel 		size 		= new JLabel("" + pan.getDrawSize()), 
				usedsize 	= new JLabel(" - " + pan.getUsedSize()),
				increment 	= new JLabel(" - " + pan.increment);
	@SuppressWarnings("rawtypes")
	
	JComboBox 	combo 		= new JComboBox();
	JCheckBox 	morph 		= new JCheckBox("Morphing");

	@SuppressWarnings("unchecked")
	
	public Fenetre() {
		
		this.setTitle("Animation");
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		JPanel container = new JPanel();
		this.setContentPane(container);
		container.setBackground(Color.white);
		container.setLayout(new BorderLayout());
		
		JPanel top = new JPanel();
		container.add(top, BorderLayout.NORTH);
		
		JLabel label = new JLabel("Choix de la forme");
		top.add(label);
		top.add(combo);
		combo.addItem("ROND");
		combo.addItem("CARRE");
		combo.addItem("TRIANGLE");
		combo.addItem("ETOILE");
		
		combo.addActionListener(new FormeListener());
		
		top.add(morph);
		morph.addActionListener(new MorphListener());
		
		container.add(pan, BorderLayout.CENTER);
	
		JPanel south = new JPanel();
		container.add(south, BorderLayout.SOUTH);
		
		south.add(btGo);
		btGo.addActionListener(new BtGOListener());
		south.add(size);
		south.add(usedsize);
		south.add(increment);
		south.add(btStop);
		
		btStop.addActionListener(new BtSTOPListener());
		btStop.setEnabled(false);
		
		this.setVisible(true);
	}

	boolean animated, backX, backY;
	int x, y;

	void go() {
		
		x = pan.getPosX();
		y = pan.getPosY();
		
		while (this.animated) {
			// Si le mode morphing est activ�, on utilise la taille actuelle de la forme
			if (pan.isMorph()) {
				if (x < 1)
					backX = false;
				if (x > pan.getWidth() - pan.getDrawSize())
					backX = true;
				if (y < 1)
					backY = false;
				if (y > pan.getHeight() - pan.getDrawSize())
					backY = true;
			} 
			else {
				if (x < 1)
					backX = false;
				if (x > pan.getWidth() - 50)
					backX = true;
				if (y < 1)
					backY = false;
				if (y > pan.getHeight() - 50)
					backY = true;
			}
			if (!backX)
				pan.setPosX(++x);
			else
				pan.setPosX(--x);
			if (!backY)
				pan.setPosY(++y);
			else
				pan.setPosY(--y);
			
			pan.repaint();
			size.setText("DrawSize : " + pan.getDrawSize());
			usedsize.setText(" - " + pan.getUsedSize());
			increment.setText(" - " + pan.increment);
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	Thread t;

	public class BtGOListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
					
			int option = JOptionPane.showConfirmDialog(
				null, 
				"Voulez-vous lancer l'animation ?", 
				"Lancement de l'animation",
				JOptionPane.YES_NO_OPTION, 
				JOptionPane.QUESTION_MESSAGE);
			
			System.out.println("option - " +option);
			
			if (option == JOptionPane.OK_OPTION) {
				
				animated = true;
				Thread t = new Thread(new PlayAnimation());
				t.start();
				btGo.setEnabled(false);
				btStop.setEnabled(true);
			}
		}
	}

	class BtSTOPListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			
			int option = JOptionPane.showConfirmDialog(
				null, 
				"Voulez-vous arr�ter l'animation ?",
				"Arr�t de l'animation",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE
			);
			
			System.out.println("option - " +option);

			if ( 	option != JOptionPane.NO_OPTION
				&& 	option != JOptionPane.CANCEL_OPTION
				&& 	option != JOptionPane.CLOSED_OPTION) {
			
				animated = false;
				btGo.setEnabled(true);
				btStop.setEnabled(false);
			}
			
		}
	}

	class PlayAnimation implements Runnable {
		@Override
		public void run() {
			go();
		}
	}

	class FormeListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			pan.setForme(combo.getSelectedItem().toString());
			pan.repaint();
		}
	}

	class MorphListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			
			if (morph.isSelected())			pan.setMorph(true);
			else							pan.setMorph(false);
		}
	}

	public static void main(String[] args) {
		new Fenetre();
	}
}
