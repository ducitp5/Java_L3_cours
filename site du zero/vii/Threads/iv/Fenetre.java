package vii.Threads.iv;

import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JFrame;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Graphics;
import javax.swing.SwingConstants;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.util.Map;

@SuppressWarnings("serial")
class Panneau extends JPanel {
	int posX = -50;
	int posY = -50;

	@Override
	public void paintComponent(Graphics g) {
		g.setColor(Color.yellow);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		g.setColor(Color.red);
		g.fillOval(posX, posY, 50, 50);
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}
}

@SuppressWarnings("serial")
public class Fenetre extends JFrame implements ThreadLister {

	Panneau pan = new Panneau();
	JButton boutonGo = new JButton("Go");
	JButton boutonStop = new JButton("Stop");
	JLabel label = new JLabel("Le JLabel");
	boolean animated = true;
	boolean backX, backY;
	int x, y;
	Thread t;

	public Fenetre() {

		this.setTitle("Animation");
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);

		JPanel container = new JPanel();
		container.setBackground(Color.white);
		container.setLayout(new BorderLayout());
		container.add(pan, BorderLayout.CENTER);

		JPanel south = new JPanel();
		container.add(south, BorderLayout.SOUTH);

		south.add(boutonGo);
		boutonGo.addActionListener(new BoutonGoListener());

		south.add(boutonStop);
		boutonStop.addActionListener(new BoutonStopListener());
		boutonStop.setEnabled(false);

		Font police = new Font("Tahoma", Font.BOLD, 16);
		label.setFont(police);
		label.setForeground(Color.blue);
		label.setHorizontalAlignment(SwingConstants.CENTER);

		container.add(label, BorderLayout.NORTH);
		this.setContentPane(container);
		this.setVisible(true);
	}

	void go() {

		x = pan.getPosX();
		y = pan.getPosY();

		while (this.animated) {
			if (x < 1)
				backX = false;
			if (x > pan.getWidth() - 50)
				backX = true;
			if (y < 1)
				backY = false;
			if (y > pan.getHeight() - 50)
				backY = true;
			if (!backX)
				pan.setPosX(++x);
			else
				pan.setPosX(--x);
			if (!backY)
				pan.setPosY(++y);
			else
				pan.setPosY(--y);
			pan.repaint();
			try {
				Thread.sleep(3);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public class BoutonGoListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			animated = true;
			t = new PlayAnimation();
			System.out.println("thread.id = " + t.getId() + " - " + t.getName());
			t.start();
			boutonGo.setEnabled(false);
			boutonStop.setEnabled(true);
			listThreads3();
		}
	}

	class BoutonStopListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			animated = false;
			boutonGo.setEnabled(true);
			boutonStop.setEnabled(false);
		}
	}

	class PlayAnimation extends Thread {
		@Override
		public void run() {
			go();
		}
	}

	
	public static void main(String[] args) {
		new Fenetre();
	}
}
