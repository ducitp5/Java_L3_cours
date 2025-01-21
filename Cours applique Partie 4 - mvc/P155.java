import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class P155 {

	public static void main(String [] args){

		JFrame jframe = new JFrame("test des JList");
	
		final JList jlist = new JList(new MonListModel( ));
	
		jframe.getContentPane( ).add(jlist, BorderLayout.CENTER);
	JButton button = new JButton("une ligne de plus");
	button.addActionListener(new ActionListener( ){
	public void actionPerformed(ActionEvent e){
	MonListModel mlm = (MonListModel)jlist.getModel( );
	mlm.incrSize( ); // modification directe du modèle ......
	}} );
	jframe.getContentPane( ).add(button, BorderLayout.SOUTH);
	JButton buttonIncrMulti = new JButton("incrémenter le multiplicateur");
	jframe.getContentPane( ).add(buttonIncrMulti, BorderLayout.NORTH);
	buttonIncrMulti.addActionListener(new ActionListener( ){
	public void actionPerformed(ActionEvent e){
	MonListModel mlm = (MonListModel)jlist.getModel( );
	mlm.incrMultiplicateur( );
	}});
	jframe.pack( );jframe.setVisible(true);
	}
	}}
}
