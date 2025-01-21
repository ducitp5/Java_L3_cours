package mouseClick;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Test3 {

	
	public static void main(String[] args) {

		JFrame	frame	=	new JFrame("Test3");
		
		frame.setSize(400, 200);
		frame.setVisible(true);
		
		Container contenu	=	frame.getContentPane();
		
		JLabel	label1	=	new JLabel("compteur 3");
		
		contenu.add(label1 , BorderLayout.WEST);
		
		JButton	bOk		=	new	JButton("click ok");
		contenu.add(bOk, BorderLayout.EAST);
		
		
		compteur c	=	new compteur();
		JLabel	label2	=	new JLabel("compteur associé ");
		contenu.add(label2 , BorderLayout.NORTH);
		
		ActionListener  click	=	new Clickmouse(c , label2);
		
		bOk.addActionListener(click);
		
		
		

	}

}


class compteur{
	
	int	value;
	
	public compteur(){
		
		this.value	=	0;
	}
	
	public void incremente(int i) {
		
		this.value	+=	i;
	}
	
	public int getvalue() {
		
		return this.value;
	}
		
}

class Clickmouse implements ActionListener {

	compteur com;
	JLabel	 label;
	
	public Clickmouse(compteur c , JLabel label) {
		
		this.com	=	c;
		this.label	=	label;
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent click) {

		this.com.incremente(1);
		
		this.label.setText("compteur origine = " +this.com.getvalue());
		
	}
	
}
