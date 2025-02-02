package iii.AnimationSimple;


import java.awt.BorderLayout;
import java.awt.Color; 			import java.io.File;
import java.awt.GradientPaint; 	import java.io.IOException;
import java.awt.Graphics; 		import javax.imageio.ImageIO;
import java.awt.Graphics2D; 	import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class Bouton extends JButton implements MouseListener {
	
	private String name;
	private Image img;

	public Bouton(String str) {
		super(str);
		this.name = str;
		
		try {
			img = ImageIO.read(new File("image.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		this.addMouseListener(this);
	}

	public void paintComponent(Graphics g) {
		
		Graphics2D g2d = (Graphics2D) g;
		GradientPaint gp = new GradientPaint(0, 0, Color.blue, 0, 20, Color.cyan,
		true);
		g2d.setPaint(gp);
		g2d.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
		g2d.setColor(Color.black);
		g2d.drawString(this.name, this.getWidth() / 2 - (this.getWidth() / 2 / 4)
		,(this.getHeight() / 2) + 5);
	}

	public void mouseClicked(MouseEvent event) {	}

	public void mouseEntered(MouseEvent event) {
		
		try { img = ImageIO.read(new File("image.jpg")); }
		catch (IOException e) { e.printStackTrace(); }
	}

	public void mouseExited(MouseEvent event) {	
		
		try { img = ImageIO.read(new File("mouseExited.jpg")); }
		catch (IOException e) { e.printStackTrace(); }
	}

	public void mousePressed(MouseEvent event) {	
		try { img = ImageIO.read(new File("fondBoutonClic.jpg"));}
		catch (IOException e) { e.printStackTrace();}
	}

	public void mouseReleased(MouseEvent event) {
		
		if (event.getY() < 0 || event.getX() < 0 || event.getY() > this.getHeight()
			|| event.getX() > this.getWidth() ) {

			try { img = ImageIO.read(new File("image.jpg")); }
			
			catch (IOException e) { e.printStackTrace(); }
			
		}
		else {
			try { img = ImageIO.read(new File("image.jpg")); }

			catch (IOException e) { e.printStackTrace(); }			
		}
	}
}

@SuppressWarnings("serial")
public class FenetreDynamic2 extends JFrame {
	
	private Panneau pan = new Panneau();
	private Bouton bouton = new Bouton("mon bouton");
	private JPanel container = new JPanel();

	private void go() {

		int x = pan.getPosX(), y = pan.getPosY();

		boolean backX = false;
		boolean backY = false;
		
		while (true) {

			if (x < 1)									backX = false;
			if (x > pan.getWidth() - 50)				backX = true;
			if (y < 1)									backY = false;
			if (y > pan.getHeight() - 50)				backY = true;

			if (!backX)									pan.setPosX(++x);
			else										pan.setPosX(--x);

			if (!backY)									pan.setPosY(++y);
			else										pan.setPosY(--y);

			pan.repaint();

			try {
				Thread.sleep(3);
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public FenetreDynamic2() {
		
		this.setTitle("Animation yy");
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		container.setBackground(Color.white);
		container.setLayout(new BorderLayout());
		container.add(pan, BorderLayout.CENTER);
		container.add(bouton, BorderLayout.SOUTH);
		
		this.setContentPane(container);
		this.setVisible(true);
		
		go();
	}

	public static void main(String[] args) {
		
		FenetreDynamic2 fen = new FenetreDynamic2();
	}
}

