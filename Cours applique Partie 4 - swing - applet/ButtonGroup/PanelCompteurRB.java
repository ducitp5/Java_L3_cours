package ButtonGroup;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


@SuppressWarnings("serial")
public class PanelCompteurRB extends JPanel {
	
	private JLabel 			label   =	 new JLabel("Compteur : 0"); 
	private JButton 		bOK  	=  	 new JButton("OK");
	
	private JRadioButton 	box1 	= 	 new JRadioButton("1"), 
							box10 	=	 new JRadioButton("10", true),
							box100 	= 	 new JRadioButton("100"); 
	
	private CompteurPlus 	compteur=	 new CompteurPlus();


	class EcouteurCompteur implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			PanelCompteurRB.this.compteur.incrementer();
			PanelCompteurRB.this.label.setText("Compteur : " +PanelCompteurRB.this.compteur.getValue( ));
			
		}
	}
	
	class EcouteurRB implements ActionListener { 
		
		private int valeur;
		
		public EcouteurRB(int valeur) {
			
			this.valeur  =  valeur; 
			
		} 
		
		public void actionPerformed(ActionEvent e) {
			
			PanelCompteurRB.this.compteur.setDefaultIncrValue(this.valeur);
			
		}
		
	}
	
	
	public PanelCompteurRB() {
		
		super(new BorderLayout());
		
		this.add(label , BorderLayout.NORTH); 	
		
		
		
		JPanel panelRadios = new JPanel( ); 	
		
			panelRadios.add(box1); 		box1  .addActionListener(new EcouteurRB(1)); 
			panelRadios.add(box10); 	box10 .addActionListener(new EcouteurRB(10)); 
			panelRadios.add(box100); 	box100.addActionListener(new EcouteurRB(100));
								
			ButtonGroup bg = new ButtonGroup( );		bg.add(box1);
														bg.add(box10);
														bg.add(box100); 
				
		this.add(panelRadios,BorderLayout.EAST);	
		
		
		this.add(bOK   , BorderLayout.SOUTH);	bOK.addActionListener(new EcouteurCompteur());
													
	}	
	
	public static void main(String [ ] args){

		JFrame 			frame 		=   new JFrame("133 Cliquez Compteur RB!");
		
		JPanel 			panel 		= 	new PanelCompteurRB();
		
		frame.getContentPane().add(panel , BorderLayout.CENTER);
		frame.setSize(500 , 500);
		frame.setVisible(true);
	}
	
}
