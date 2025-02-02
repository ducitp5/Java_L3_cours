package iii.AnimationSimple;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

class Panneau extends JPanel {
	
	public int posX = -50;
	public int posY = -50;

	public void paintComponent(Graphics g) {
// On d�cide d'une couleur de fond pour notre rectangle
		g.setColor(Color.white);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		
// On red�finit une couleur pour notre rond
		g.setColor(Color.red);
		g.fillOval(posX, posY, 50, 50);
	}

	public int getPosX() {
		return posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}
}

@SuppressWarnings("serial")
public class FenetreDynamic extends JFrame {

	public Panneau pan = new Panneau();
	
	FenetreDynamic() {
		
		this.setTitle("Animation");
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setContentPane(pan);
		this.setVisible(true);
		
		go();
	}

	public void go() {
		
		for (int i = -50; i < pan.getWidth(); i++) {
			
			int x = pan.getPosX(), y = pan.getPosY();
			x++;
			y++;
			
			pan.setPosX(x);
			pan.setPosY(y);
			pan.repaint();
			
			try {
				Thread.sleep(10);
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		
		JFrame fenetre = new FenetreDynamic();
	}
}
