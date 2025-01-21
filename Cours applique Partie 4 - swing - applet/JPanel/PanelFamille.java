package JPanel;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import WindowAdapter.GestionnaireFermeture;

@SuppressWarnings("serial")
public class PanelFamille extends JPanel {

	private String 		nomFamille;
	
	private JTextField 	textPrenom 		= new JTextField(20);
	
	private JButton 	buttonCompte 	= new JButton("Editer le compte");
	private JButton 	buttonQuitter 	= new JButton("Quitter");

	
	public PanelFamille(String nomFamille) { 
	
		super(new BorderLayout());
		
		this.nomFamille  =  nomFamille; 
		
		JPanel 	  panelPrenom   =   new JPanel(); 
		
		panelPrenom.setLayout( new BorderLayout() );
		
		panelPrenom.add(new JLabel("Pr\u00E9nom "), BorderLayout.WEST); 
		
		panelPrenom.add(this.textPrenom 		  , BorderLayout.EAST);
	

		this.setLayout(new GridLayout(4,1,20,20)); 
		this.add(new JLabel("LES COMPTES DE LA FAMILLE "+nomFamille+" ")); 
		this.add(panelPrenom);
		this.add(this.buttonCompte); 
		this.add(this.buttonQuitter);
		
		this.buttonQuitter.addActionListener((ActionListener) new GestionnaireFermeture(null));
		
		this.buttonCompte.addActionListener(editListener);
		this.textPrenom.addActionListener(editListener);
	}
	
	ActionListener editListener=new ActionListener( ){
		
		public void actionPerformed(ActionEvent e) {
			
			String prenom = PanelFamille.this.textPrenom.getText( ); 
			final CompteG compte = CompteG.load(prenom+" "+ PanelFamille.this. nomFamille); 
			
			final JFrame frame = new JFrame("COMPTE DE "+compte.getNomTitulaire( )); 
			
			frame.getContentPane().add(new PanelCompte(compte),BorderLayout.CENTER);
			final JButton buttonQuitter = new JButton("Traitement du compte terminé"); 
			
			buttonQuitter.addActionListener(new ActionListener(){
		
				public void actionPerformed(ActionEvent event){ 
					
	//				compte.sauvegarder( );
					frame.dispose( );
				}
		
			}); 
			
			frame.pack( ); 
			frame.setVisible(true);
			
		}
		
	};
		
	
}
	
