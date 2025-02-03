package viii.JComboBox.iii;

import java.awt.BorderLayout;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Fenetre extends JFrame {
	String[] tab = { "tuychon 1", "tuychon 2", "tuychon 3", "tuychon 4" };
	
	JComboBox combo = new JComboBox(tab);

	/*
	 * combo.addItem("Option 1"); combo.addItem("Option 2");
	 * combo.addItem("Option 3"); combo.addItem("Option 4");
	 */
	public Fenetre() {
		
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
		
		JLabel label = new JLabel("Une ComboBox");
		top.add(label);
		top.add(combo);
		
		combo.setPreferredSize(new Dimension(100, 20));
		combo.addItemListener(new ItemState());
		combo.addActionListener(new ItemAction());
		
		this.setVisible(true);
	}

	class ItemState implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			System.out.println(e.getSource().getClass().getSimpleName() + " : ItemListener : événement déclenché sur : "
					+ e.getItem());
		}
	}

	class ItemAction implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.out.println(e.getSource().getClass().getSimpleName() + " : ActionListener : action sur "
					+ combo.getSelectedItem());
		}
	}

	public static void main(String[] args) {
		new Fenetre2();
	}
}
