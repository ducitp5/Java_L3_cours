package vi.Calculatrice;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Calculatrice extends JFrame {

	JPanel 		container 		= new JPanel();
	String[] 	tab_string 		= { "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", ".", "=", "C", "+", "-", "*", "/" };
	JButton[] 	tab_button 		= new JButton[tab_string.length];
	JLabel 		ecran 			= new JLabel();

	Dimension 	dim 			= new Dimension(50, 40);
	Dimension 	dim2 			= new Dimension(50, 31);
	double 		chiffre1;
	boolean 	clicOperateur 	= false,
				update 			= false;
	String 		operateur 		= "";

	private void initComposant() {

		Font police = new Font("Arial", Font.BOLD, 20);

		ecran = new JLabel("0");
		ecran.setFont(police);
		ecran.setHorizontalAlignment(JLabel.RIGHT);
		ecran.setPreferredSize(new Dimension(220, 20));

		JPanel operateur 	= new JPanel();
		operateur.setPreferredSize(new Dimension(55, 225));
		
		JPanel chiffre 		= new JPanel();
		chiffre.setPreferredSize(new Dimension(165, 225));
		
		JPanel panEcran 	= new JPanel();
		panEcran.setPreferredSize(new Dimension(220, 30));

		for (int i = 0; i < tab_string.length; i++) {

			tab_button[i] = new JButton(tab_string[i]);

			switch (i) {
			
				case 11:   			// =
					tab_button[i].addActionListener(new EgalListener());
					tab_button[i].setPreferredSize(dim);
					chiffre.add(tab_button[i]);
					break;
				case 12:			// C
					tab_button[i].setForeground(Color.red);
					tab_button[i].addActionListener(new ResetListener());
					tab_button[i].setPreferredSize(dim2);
					operateur.add(tab_button[i]);
					break;
				case 13:			// +
					tab_button[i].addActionListener(new PlusListener());
					tab_button[i].setPreferredSize(dim2);
					operateur.add(tab_button[i]);
					break;
				case 14:			// -
					tab_button[i].addActionListener(new MoinsListener());
					tab_button[i].setPreferredSize(dim2);
					operateur.add(tab_button[i]);
					break;
				case 15:			// *
					tab_button[i].addActionListener(new MultiListener());
					tab_button[i].setPreferredSize(dim2);
					operateur.add(tab_button[i]);
					break;
				case 16:			// /
					tab_button[i].addActionListener(new DivListener());
					tab_button[i].setPreferredSize(dim2);
					operateur.add(tab_button[i]);
					break;
				default:
					tab_button[i].addActionListener(new ChiffreListener());
					tab_button[i].setPreferredSize(dim);
					chiffre.add(tab_button[i]);
					break;
			}
		}
		
		panEcran.add(ecran);
		panEcran.setBorder(BorderFactory.createLineBorder(Color.black));
		
		container.add(panEcran, BorderLayout.NORTH);
		container.add(chiffre, BorderLayout.CENTER);
		container.add(operateur, BorderLayout.EAST);
	}

	public Calculatrice() {
		this.setSize(255, 265);
		this.setTitle("Calculette");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		initComposant();
		this.setContentPane(container);
		this.setVisible(true);
	}

	private void calcul() {
		if (operateur.equals("+")) {
			chiffre1 = chiffre1 + Double.valueOf(ecran.getText()).doubleValue();
			ecran.setText(String.valueOf(chiffre1));
		}
		if (operateur.equals("-")) {
			chiffre1 = chiffre1 - Double.valueOf(ecran.getText()).doubleValue();
			ecran.setText(String.valueOf(chiffre1));
		}
		if (operateur.equals("*")) {
			chiffre1 = chiffre1 * Double.valueOf(ecran.getText()).doubleValue();
			ecran.setText(String.valueOf(chiffre1));
		}
		if (operateur.equals("/")) {
			try {
				chiffre1 = chiffre1 / Double.valueOf(ecran.getText()).doubleValue();
				ecran.setText(String.valueOf(chiffre1));
			} catch (ArithmeticException e) {
				ecran.setText("0");
			}
		}
	}

	class ChiffreListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {

			String str = ((JButton) e.getSource()).getText();

			if (update) {
				update = false;
			} else {
				if (!ecran.getText().equals("0"))
					str = ecran.getText() + str;
			}
			ecran.setText(str);
		}
	}

	class EgalListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			calcul();
			update = true;
			clicOperateur = false;
		}
	}

	class PlusListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			if (clicOperateur) {
				calcul();
				ecran.setText(String.valueOf(chiffre1));
			} else {
				chiffre1 = Double.valueOf(ecran.getText()).doubleValue();
				clicOperateur = true;
			}
			operateur = "+";
			update = true;
		}
	}

	class MoinsListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			if (clicOperateur) {
				calcul();
				ecran.setText(String.valueOf(chiffre1));
			} else {
				chiffre1 = Double.valueOf(ecran.getText()).doubleValue();
				clicOperateur = true;
			}
			operateur = "-";
			update = true;
		}
	}

	class MultiListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			if (clicOperateur) {
				calcul();
				ecran.setText(String.valueOf(chiffre1));
			} else {
				chiffre1 = Double.valueOf(ecran.getText()).doubleValue();
				clicOperateur = true;
			}
			operateur = "*";
			update = true;
		}
	}

	class DivListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			if (clicOperateur) {
				calcul();
				ecran.setText(String.valueOf(chiffre1));
			} else {
				chiffre1 = Double.valueOf(ecran.getText()).doubleValue();
				clicOperateur = true;
			}
			operateur = "/";
			update = true;
		}
	}

	class ResetListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			clicOperateur = false;
			update = true;
			chiffre1 = 0;
			operateur = "";
			ecran.setText("");
		}
	}
}
