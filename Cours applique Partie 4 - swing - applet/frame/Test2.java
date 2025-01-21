package frame;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


class compteur {
	
	int	value;
	
	public compteur() 		{		this.value	=	0;		}
	
	public int incrementer( int i )  {
		
		return		this.value	+=	i;
	}
	
	public String getvalue() {
		
		return	"compteur origi = " +this.value;
	}
}


class Click	implements ActionListener {
	
	compteur	com = new compteur();
	JLabel		label;
	
	public Click( compteur com , JLabel label) {
		
		this.com	=	com;
		this.label	=   label;
		
		
	}


	public void actionclick(ActionEvent  a) {
		
	}


	@Override
	public void actionPerformed(ActionEvent a) {

		this.com.incrementer(1);
		
		this.label.setText("compteur click = " +this.com.getvalue());		
	}
}
public class Test2 {

	
	public static void main(String[] args) {

		JFrame   frame    =  	new JFrame("test 2");
		
		frame.setSize(300, 150);
		frame.setVisible(true);
		
		Container  	contenue	;		contenue	=	frame.getContentPane();
		
		JLabel	label	=	new JLabel("kekke");
		JLabel	label2	=	new JLabel("kaka");
		
		contenue.add(label);
		contenue.add(label2 , BorderLayout.AFTER_LINE_ENDS);
		
		JButton		ok	=	new JButton("click vao day");
		
		contenue.add(ok , BorderLayout.NORTH);
		
		
		compteur c = new compteur();
		
		ActionListener 	ac	=	new Click(c , label);
		
		ok.addActionListener(ac);
	}

}

