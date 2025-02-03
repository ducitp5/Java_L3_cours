package iii.Horloge;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class Fenetre extends JFrame {
	
	private JLabel label = new JLabel();
	private Horloge horloge;

	public Fenetre() {
	
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setSize(200, 80);
		
		this.horloge = new Horloge();
		
		this.horloge.addObservateur(new Observateur() {
			
			public void update(String hour) {
				System.out.println("Fenetre - " +hour);

				label.setText(hour);
			}
		});
		
		Font police = new Font("DS-digital", Font.TYPE1_FONT, 30);
		
		this.label.setFont(police);
		this.label.setHorizontalAlignment(JLabel.CENTER);
		
		this.getContentPane().add(this.label, BorderLayout.CENTER);
		this.setVisible(true);
		
		this.horloge.run();
	}

	public static void main(String[] args) {
		new Fenetre();
	}
}