package x.JTextField.ii;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.text.MaskFormatter;

@SuppressWarnings("serial")
public class Fenetre2 extends JFrame {
	
	JFormattedTextField jtf, jtf2;

	public Fenetre2() {
		
		this.setTitle("Animation");
		this.setSize(300, 150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		JPanel top = new JPanel();
		this.setContentPane(top);
		
		JLabel label = new JLabel("Téléphone FR ");
		top.add(label);
		
		try {
			MaskFormatter tel = new MaskFormatter("##-##-##-##-##");
			jtf = new JFormattedTextField(tel);
			
			MaskFormatter telUSA = new MaskFormatter("###-####");
			jtf2 = new JFormattedTextField(telUSA);
		} 
		catch (ParseException e) {
			e.printStackTrace();
		}
		
		Font police = new Font("Arial", Font.BOLD, 14);
		jtf.setFont(police);
		top.add(jtf);
		
		jtf.setPreferredSize(new Dimension(150, 30));
		jtf.setForeground(Color.BLUE);
		
		JLabel label2 = new JLabel("Téléphone USA");
		top.add(label2);
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
			System.out.println("Téléphone FR : " + jtf.getText());
			System.out.println("Téléphone USA : " + jtf2.getText());
		}
	}

	public static void main(String[] args) {
		new Fenetre2();
	}
}
