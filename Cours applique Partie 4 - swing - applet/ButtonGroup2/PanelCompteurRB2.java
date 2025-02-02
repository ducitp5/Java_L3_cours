package ButtonGroup2;

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
public class PanelCompteurRB2 extends JPanel {
	
	private JLabel 			label   =	 new JLabel("Compteur : 0"); 
	private JButton 		bOK  	=  	 new JButton("OK");
	
	private JRadioButton 	box1 	= 	 new JRadioButton("1"), 
							box10 	=	 new JRadioButton("10",true),
							box100 	= 	 new JRadioButton("100"); 
	
	private CompteurPlus2 	compteur=	 new CompteurPlus2();


	class EcouteurCompteur implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			System.out.println("EcouteurCompteur.actionPerformed - " +Thread.currentThread().getId());

			PanelCompteurRB2.this.compteur.incrementer();
			PanelCompteurRB2.this.label.setText("Compteur : " +PanelCompteurRB2.this.compteur.getValue( ));
			
		}
	}
	
	class EcouteurRB implements ActionListener { 
		
		private int valeur;
		
		public EcouteurRB(int valeur) {
			
			this.valeur  =  valeur; 
			
		} 
		
		public void actionPerformed(ActionEvent e) {
			System.out.println("EcouteurRB.actionPerformed - " +Thread.currentThread().getId());

			PanelCompteurRB2.this.compteur.setDefaultIncrValue(this.valeur);
			
		}
		
	}
	
	
	public PanelCompteurRB2() {
		
		super(new BorderLayout());
		System.out.println("PanelCompteurRB2() - " +Thread.currentThread().getId());

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

		System.out.println("PanelCompteurRB2.main - " +Thread.currentThread().getId());

		JFrame 			frame 		=   new JFrame("223 Cliquez Compteur RB! 2");
		
		JPanel 			panel 		= 	new PanelCompteurRB2();
		
		frame.getContentPane().add(panel , BorderLayout.CENTER);
		frame.setSize(1300 , 200);
		frame.setVisible(true);
	}
	
}
