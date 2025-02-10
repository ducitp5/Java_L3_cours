package x.JTextField.ii;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Fenetre extends JFrame {
	
	JFormattedTextField jtf 	= new JFormattedTextField(NumberFormat.getIntegerInstance()),
						jtf2 	= new JFormattedTextField(NumberFormat.getPercentInstance());

	public Fenetre() {
		
		this.setTitle("Animation");
		this.setSize(500, 100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		JPanel top = new JPanel();
		this.setContentPane(top);
		
		JLabel label = new JLabel("Un JTextField");
		top.add(label);
		
		Font police = new Font("Arial", Font.BOLD, 14);
		jtf.setFont(police);
		
		top.add(jtf);
		jtf.setPreferredSize(new Dimension(150, 30));
		jtf.setForeground(Color.BLUE);
		
		jtf2.setPreferredSize(new Dimension(150, 30));		
		top.add(jtf2);
		
		JButton b = new JButton("OK");
		top.add(b);
		b.addActionListener(new BoutonListener());
		
		this.setVisible(true);
	}

	class BoutonListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("TEXT : jtf " + jtf.getText());
			System.out.println("TEXT : jtf2 " + jtf2.getText());
		}
	}

	public static void main(String[] args) {
		new Fenetre();
	}
}