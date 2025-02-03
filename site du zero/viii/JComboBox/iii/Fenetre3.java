package viii.JComboBox.iii;

import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Fenetre3 extends JFrame {
	
	Panneau 			pan 		= new Panneau();
	JButton 			boutonGo 	= new JButton("Go"), 
						boutonStop 	= new JButton("Stop");
	JComboBox<String> 	combo 		= new JComboBox<String>();

	PlayAnimation 		playAnimation; 
	Thread 				t; 

	boolean 			$played 	= false;
	
	public Fenetre3() {		   
	    
		playAnimation 	= new PlayAnimation();
		t 				= new Thread(playAnimation); 
		
		this.setTitle("Animation 3");
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		JPanel container = new JPanel();
		this.setContentPane(container);
		container.setBackground(Color.white);
		container.setLayout(new BorderLayout());
		
		JPanel top = new JPanel();
		container.add(top, BorderLayout.NORTH);
		
		JLabel label = new JLabel("Choix de la forme");
		top.add(label);
		top.add(combo);
		
		combo.addItem("ROND");
		combo.addItem("CARRE");
		combo.addItem("TRIANGLE");
		combo.addItem("ETOILE");
		
		combo.addActionListener(new FormeListener());
		
		container.add(pan, BorderLayout.CENTER);
		
		JPanel south = new JPanel();
		container.add(south, BorderLayout.SOUTH);
		
		south.add(boutonGo);
		boutonGo.addActionListener(new BoutonGoListener());
		
		south.add(boutonStop);
		boutonStop.addActionListener(new BoutonStopListener());
		boutonStop.setEnabled(false);
		
		this.setVisible(true);
	}

	boolean animated, backX, backY;

	private void go() {
		int x, y;
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
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public class BoutonGoListener implements ActionListener {
	    @Override
	    public void actionPerformed(ActionEvent arg0) {
	    	
			if (!$played) {
				$played = true;
				t.start(); // Start the thread once
			}
			synchronized (playAnimation) { // Notify on PlayAnimation instance
				animated = true;
				playAnimation.notify();
			}
			boutonGo.setEnabled(false);
			boutonStop.setEnabled(true);
	        System.out.println("BoutonGoListener : " + t.getId() + " - " + t.getState());
	    }
	}

	class BoutonStopListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			
	        animated = false;
	        boutonGo.setEnabled(true);
	        boutonStop.setEnabled(false);
	        
			System.out.println("BoutonStop : " + t.getId() + " - " + t.getState());
		}
	}

	class PlayAnimation implements Runnable {
	
		@Override
		public void run() {
					
			synchronized (this) {
	            while (true) {
	                while (!animated) {  // If animation is stopped, pause the thread
	                    try {
	                        wait();
	                    } catch (InterruptedException e) {
	                        e.printStackTrace();
	                    }
	                }
	    			System.out.println("PlayAnimation - before go() : " + t.getId() + " - " + t.getState());
	    			go();
	    			System.out.println("PlayAnimation - after go() : " + t.getId() + " - " + t.getState());
	            }
	        }
		}
	}

	class FormeListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			pan.setForme(combo.getSelectedItem().toString());
			pan.repaint();
//			System.out.println("nbthread : " + nbThreads);
		}
	}
	
	public static void main(String[] args) {
		new Fenetre3();
	}

}

class Panneau extends JPanel {
	// Position initiale
	int posX = -50;
	int posY = -50;
	String forme = "ROND";

	@Override
	public void paintComponent(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		g.setColor(Color.red);
		draw(g);
	}

	public void draw(Graphics g) {
		if (this.forme.equals("ROND")) {
			g.fillOval(posX, posY, 50, 50);
		} else if (this.forme.equals("CARRE")) {
			g.fillRect(posX, posY, 50, 50);
		} else if (this.forme.equals("TRIANGLE")) {
			int s1X = posX + 25;
			int s1Y = posY;
			int s2X = posX + 50;
			int s2Y = posY + 50;
			int s3X = posX;
			int s3Y = posY + 50;
			int[] ptsX = { s1X, s2X, s3X };
			int[] ptsY = { s1Y, s2Y, s3Y };
			g.fillPolygon(ptsX, ptsY, 3);
		} else if (this.forme.equals("ETOILE")) {
			int s1X = posX + 25;
			int s1Y = posY;
			int s2X = posX + 50;
			int s2Y = posY + 50;
			g.drawLine(s1X, s1Y, s2X, s2Y);
			int s3X = posX;
			int s3Y = posY + 17;
			g.drawLine(s2X, s2Y, s3X, s3Y);

			int s4X = posX + 50;
			int s4Y = posY + 17;
			g.drawLine(s3X, s3Y, s4X, s4Y);
			int s5X = posX;
			int s5Y = posY + 50;
			g.drawLine(s4X, s4Y, s5X, s5Y);
			g.drawLine(s5X, s5Y, s1X, s1Y);
		}
	}

	public void setForme(String form) {
		this.forme = form;
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
