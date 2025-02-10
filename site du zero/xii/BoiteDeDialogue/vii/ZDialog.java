package xii.BoiteDeDialogue.vii;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

@SuppressWarnings("serial")
public class ZDialog extends JDialog {
	
	ZDialogInfo zInfo = new ZDialogInfo();

	public ZDialog(JFrame parent, String title, boolean modal) {
		
		super(parent, title, modal);
		
		this.setSize(550, 270);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
		this.initComponent();
	}

	public ZDialogInfo showZDialog() {
		this.setVisible(true);
		return this.zInfo;
	}

	void initComponent() {
		
		JPanel panIcon = new JPanel();
		this.getContentPane().add(panIcon, BorderLayout.WEST);
		panIcon.setBackground(Color.white);
		panIcon.setLayout(new BorderLayout());
		
		JLabel icon = new JLabel(new ImageIcon("images/knigh.jpg"));
		panIcon.add(icon);
		
		JPanel content = new JPanel();
		this.getContentPane().add(content, BorderLayout.CENTER);
		content.setBackground(Color.white);
		
		JPanel panNom = new JPanel();
		content.add(panNom);
		panNom.setBackground(Color.white);
		panNom.setPreferredSize(new Dimension(220, 60));
		panNom.setBorder(BorderFactory.createTitledBorder("Nom du personnage"));
		
		JLabel nomLabel = new JLabel("Saisir un nom :");
		panNom.add(nomLabel);
		
		JTextField nom = new JTextField();
		panNom.add(nom);
		nom.setPreferredSize(new Dimension(100, 25));
		
		JPanel panSexe = new JPanel();
		content.add(panSexe);
		panSexe.setBackground(Color.white);
		panSexe.setPreferredSize(new Dimension(220, 60));
		panSexe.setBorder(BorderFactory.createTitledBorder("Sexe du personnage"));
		
		JLabel sexeLabel = new JLabel("Sexe : ");
		panSexe.add(sexeLabel);
		
		JComboBox<String> sexe = new JComboBox<String>();
		panSexe.add(sexe);
		sexe.addItem("Masculin");
		sexe.addItem("Féminin");
		sexe.addItem("Indéterminé");
		
		JPanel panAge = new JPanel();
		content.add(panAge);
		panAge.setBackground(Color.white);
		panAge.setBorder(BorderFactory.createTitledBorder("Age du personnage"));
		panAge.setPreferredSize(new Dimension(440, 60));
		
		JRadioButton tranche1 = new JRadioButton("15 - 25 ans");
		panAge.add(tranche1);
		tranche1.setSelected(true);
		
		JRadioButton tranche2 = new JRadioButton("26 - 35 ans");
		panAge.add(tranche2);
		
		JRadioButton tranche3 = new JRadioButton("36 - 50 ans");
		panAge.add(tranche3);
		
		JRadioButton tranche4 = new JRadioButton("+ de 50 ans");
		panAge.add(tranche4);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(tranche1);
		bg.add(tranche2);
		bg.add(tranche3);
		bg.add(tranche4);
		
		JPanel panTaille = new JPanel();
		content.add(panTaille);
		panTaille.setBackground(Color.white);
		panTaille.setPreferredSize(new Dimension(220, 60));
		panTaille.setBorder(BorderFactory.createTitledBorder("Taille du personnage"));
		
		JLabel tailleLabel = new JLabel("Taille : ");
		panTaille.add(tailleLabel);
		
		JTextField taille = new JTextField("180");
		taille.setPreferredSize(new Dimension(90, 25));
		panTaille.add(taille);
		
		JLabel taille2Label = new JLabel(" cm");
		panTaille.add(taille2Label);
		
		JPanel panCheveux = new JPanel();
		content.add(panCheveux);
		panCheveux.setBackground(Color.white);
		panCheveux.setPreferredSize(new Dimension(220, 60));
		panCheveux.setBorder(BorderFactory.createTitledBorder("Couleur de cheveux du personnage"));
		
		JLabel cheveuxLabel = new JLabel("Cheveux");
		panCheveux.add(cheveuxLabel);
		
		JComboBox<String> cheveux = new JComboBox<String>();
		panCheveux.add(cheveux);
		cheveux.addItem("Blond");
		cheveux.addItem("Brun");
		cheveux.addItem("Roux");
		cheveux.addItem("Blanc");
		
		JPanel control = new JPanel();
		this.getContentPane().add(control, BorderLayout.SOUTH);
		
		JButton okBouton = new JButton("OK");
		control.add(okBouton);
		okBouton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				zInfo = new ZDialogInfo(
					nom.getText(), 
					(String) sexe.getSelectedItem(), 
					getAge(),
					(String) cheveux.getSelectedItem(), 
					getTaille()
				);
				setVisible(false);
			}

			public String getAge() {
				return (tranche1.isSelected()) ? tranche1.getText()
						: (tranche2.isSelected()) ? tranche2.getText()
								: (tranche3.isSelected()) ? tranche3.getText()
										: (tranche4.isSelected()) ? tranche4.getText() : tranche1.getText();
			}

			public String getTaille() {
				return (taille.getText().equals("")) ? "180" : taille.getText();
			}
		});
		
		JButton cancelBouton = new JButton("Annuler");
		control.add(cancelBouton);
		cancelBouton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
	}
}
