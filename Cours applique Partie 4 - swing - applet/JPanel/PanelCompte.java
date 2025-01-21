package JPanel;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import up5.mi.pary.jc.compte.exception.DecouvertException;
import up5.mi.pary.jc.compte.exception.MontantNulException;

public class PanelCompte extends JPanel {

	private CompteG compte;
	private JTextField textMontant = new JTextField(10);
	private JButton buttonCredit = new JButton("CREDIT"); private JButton buttonDebit = new JButton("DEBIT");
	private JButton buttonAnnuler = new JButton("Annuler la dernière opération");
	private JTextField textSolde = new JTextField(10);
	private JTextArea textareaHisto = new JTextArea(10,14);
	private JTextArea messageErreur = new JTextArea(3,10);


	public PanelCompte(CompteG compte){

		this.compte=compte;
		JPanel panelHaut=new JPanel(new FlowLayout( ));
		JPanel panelMontant = new JPanel(new BorderLayout( ) );
		panelMontant.add(new JLabel("Montant "),BorderLayout.WEST);
		panelMontant.add(this.textMontant ,BorderLayout.EAST);
		panelHaut.add(panelMontant);
		JPanel panelOper = new JPanel(new BorderLayout( ) );
		panelOper.add(this.buttonCredit,BorderLayout.NORTH);
		panelOper.add(this.buttonDebit ,BorderLayout.SOUTH);
		panelHaut.add(panelOper);


		JPanel panelHistoSolde = new JPanel(new BorderLayout( ));
		JPanel panelSolde = new JPanel(new BorderLayout( ));
		panelSolde.add(new JLabel("Solde : ") ,BorderLayout.WEST);
		panelSolde.add(this.textSolde ,BorderLayout.EAST);
		panelHistoSolde.add(new JLabel("Historique : ") ,BorderLayout.WEST);
		this.textareaHisto.setEditable(false);
		JScrollPane jsp=new JScrollPane(this.textareaHisto);
		panelHistoSolde.add(jsp, BorderLayout.EAST);
		panelHistoSolde.add(panelSolde, BorderLayout.SOUTH);
		panelHaut.add(panelHistoSolde);
		JPanel panelAnnulerEtQuitter = new JPanel(new BorderLayout( ));
		panelAnnulerEtQuitter.add(this.buttonAnnuler, BorderLayout.NORTH);
		panelAnnulerEtQuitter.add(new JScrollPane(this.messageErreur), BorderLayout.CENTER);
		this.messageErreur.setEditable(false);
		this.add(panelHaut , BorderLayout.NORTH);
		this.add(panelAnnulerEtQuitter , BorderLayout.SOUTH);


		ActionListener ecouteur=new GestionnaireCompte( );
		this.buttonCredit.addActionListener(ecouteur);
		this.buttonDebit.addActionListener(ecouteur);
		this.buttonAnnuler.addActionListener(ecouteur);
		this.buttonCredit.setActionCommand("Crédit");
		this.buttonDebit.setActionCommand("Débit");
		this.buttonAnnuler.setActionCommand("Annuler");
		miseAJourInfo( );

	}

	private void miseAJourInfo( ){
		this.textareaHisto.setText(this.compte.getHistorique( ));
		java.text.DecimalFormat df = new java.text.DecimalFormat("0.00"); this.textSolde.setText(df.format(this.compte.getSolde( )));
		this.messageErreur.setText("");

	}


	class GestionnaireCompte implements ActionListener{
		public void actionPerformed(ActionEvent event){
			String com = event.getActionCommand( );
			try {
				if (com.equals("Annuler")) PanelCompte.this.compte.annulerDerniereOperation( ) ; 
				else if (com.equals("Crédit") || com.equals("Débit")) {
					double m = Double.valueOf(PanelCompte.this.textMontant.getText( )).doubleValue( );
					PanelCompte.this.compte.addOperation(com.equals("Crédit") ? m : -m);
				} PanelCompte.this.miseAJourInfo( );
			}
			catch (DecouvertException e) {
				PanelCompte.this.messageErreur.setText("Operation ignoree "+e);}
			catch (MontantNulException e){PanelCompte.this.messageErreur.setText(e.getMessage( ));}
			catch (Exception e) {PanelCompte.this.messageErreur.setText(""+e);}
		}

	}



}
