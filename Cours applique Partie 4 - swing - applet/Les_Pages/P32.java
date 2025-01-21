package Les_Pages;

import java.awt.BorderLayout;
import java.awt.Container;
import java.io.File;


import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class P32 {

	public static void main(String[] args) {

		JFrame frame = new JFrame("Cliquez !");
		frame.setVisible(true);			frame.setSize(300, 400);

		Container pane = frame.getContentPane();
System.out.println(new File("tutu.gif").getAbsolutePath());
		Icon icon = new ImageIcon("tutu.gif");
		JButton button = new JButton("OK", icon);		pane.add(button, BorderLayout.SOUTH);

		JLabel label = new JLabel("label 1");
		pane.add(label, BorderLayout.NORTH);

		JCheckBox box10 = new JCheckBox("dix par dix");	pane.add(box10);
	}

}
