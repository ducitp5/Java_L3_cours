package ix.JCheckBox.ii;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;

public class Fenetre2 extends JFrame {
	
	JRadioButton 	jr1 = new JRadioButton("Radio 1"), 
					jr2 = new JRadioButton("Radio 2");

	public Fenetre2() {
		
		this.setTitle("Animation");
		this.setSize(300, 150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		JPanel container = new JPanel();
		this.setContentPane(container);
		container.setBackground(Color.white);
		container.setLayout(new BorderLayout());
		
		JPanel top = new JPanel();
		container.add(top, BorderLayout.NORTH);
		top.add(jr1);
		jr1.addActionListener(new StateListener());
		jr1.setSelected(true);
		
		top.add(jr2);
		jr2.addActionListener(new StateListener());
		ButtonGroup bg = new ButtonGroup();
		
		bg.add(jr1);
		bg.add(jr2);
		
		this.setVisible(true);
	}

	class StateListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.out.println("source : " + jr1.getText() + " - état : " + jr1.isSelected());
			System.out.println("source : " + jr2.getText() + " - état : " + jr2.isSelected());
		}
	}

	public static void main(String[] args) {
		new Fenetre2();
	}
}
