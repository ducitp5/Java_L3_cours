package JMenu;

import javax.swing.JApplet;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


@SuppressWarnings("serial")
public class P102 extends JApplet {


	public void init( )	{
		
		
		JMenuBar mb = new JMenuBar( );		this.setJMenuBar(mb);
		

		JMenu mFichier 		= new JMenu("Fichier");				mb.add(mFichier);
	
			JMenuItem miQuit = new JMenuItem("sans sauvegarder");		mFichier.add(miQuit);		
			JMenuItem miSauv = new JMenuItem("Sauvegarder");			mFichier.add(miSauv);		
		
		
		
		
		
		JMenu mLesComptes 	= new JMenu("les comptes");			mb.add(mLesComptes);
	
			JMenu m2a 			= new JMenu("Consulter");		mLesComptes.add(m2a);
			
				JMenuItem miSolde = new JMenuItem("le solde");			m2a.add(miSolde);		
				JMenuItem miHisto = new JMenuItem("l'historique");		m2a.add(miHisto);			
					
			JMenu m2b 			= new JMenu("Modifier");		mLesComptes.add(m2b);			
		
				JMenuItem miCredit= new JMenuItem("crédit");			m2b.add(miCredit);
				JMenuItem miDebit = new JMenuItem("débit");				m2b.add(miDebit);
				
		
		

	}
}
