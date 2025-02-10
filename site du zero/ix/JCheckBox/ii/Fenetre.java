package ix.JCheckBox.ii;

import java.awt.BorderLayout;
import javax.swing.JCheckBox;
import java.awt.Color;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class Fenetre extends JFrame {
	
	public Fenetre() {
	
		this.setTitle("Animation");
		this.setSize(200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		JPanel container = new JPanel();
		this.setContentPane(container);
		container.setBackground(Color.white);
		container.setLayout(new BorderLayout());
		
		JPanel top = new JPanel();
		container.add(top, BorderLayout.NORTH);
		
		JCheckBox check1 = new JCheckBox("Case 1");
		top.add(check1);
		check1.addActionListener(new StateListener());
		
		JCheckBox check2 = new JCheckBox("Case 2");
		top.add(check2);
		check2.addActionListener(new StateListener());
		
		this.setVisible(true);
	}

	class StateListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.out.println("source : " + ((JCheckBox) e.getSource()).getText() + " - état : "
					+ ((JCheckBox) e.getSource()).isSelected());
		}
	}

	public static void main(String[] args) {
		new Fenetre();
	}
}
