package ix.JCheckBox.iii;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Panneau extends JPanel {
	
	boolean 	morph;
	String 		forme = "ROND";

	@Override
	public void paintComponent(Graphics g) {
		
		g.setColor(Color.white);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		g.setColor(Color.red);
		if (this.morph)
			drawMorph(g);
		else
			draw(g);
	}

	int posX = -50;
	int posY = -50;

	void draw(Graphics g) {
		
		if (this.forme.equals("ROND")) {
			g.fillOval(posX, posY, 50, 50);
		} 
		else if (this.forme.equals("CARRE")) {
			g.fillRect(posX, posY, 50, 50);
		} 
		else if (this.forme.equals("TRIANGLE")) {
			int s1X = posX + 25;
			int s1Y = posY;
			int s2X = posX + 50;
			int s2Y = posY + 50;
			int s3X = posX;
			int s3Y = posY + 50;
			int[] ptsX = { s1X, s2X, s3X };
			int[] ptsY = { s1Y, s2Y, s3Y };
			g.fillPolygon(ptsX, ptsY, 3);
		} 
		else if (this.forme.equals("ETOILE")) {
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

	int 	increment, 
			drawSize;
	boolean reduce;

	public void drawMorph(Graphics g) {
		
		increment++;
		
		if (drawSize >= 70)			reduce = true; // size max = 70
		if (drawSize <= 20)			reduce = false; // size min = 20
	
		if (reduce)					drawSize = drawSize - getUsedSize();
		else						drawSize = drawSize + getUsedSize();
		
		System.out.println(drawSize + " - " + getUsedSize() + " - " + increment);
		
		if (this.forme.equals("ROND")) {
			g.fillOval(posX, posY, drawSize, drawSize);
		}
		if (this.forme.equals("CARRE")) {
			g.fillRect(posX, posY, drawSize, drawSize);
		}
		if (this.forme.equals("TRIANGLE")) {
			int s1X = posX + drawSize / 2;
			int s1Y = posY;
			int s2X = posX + drawSize;
			int s2Y = posY + drawSize;
			int s3X = posX;
			int s3Y = posY + drawSize;
			int[] ptsX = { s1X, s2X, s3X };
			int[] ptsY = { s1Y, s2Y, s3Y };
			g.fillPolygon(ptsX, ptsY, 3);
		}
		if (this.forme.equals("ETOILE")) {
			int s1X = posX + drawSize / 2;
			int s1Y = posY;
			int s2X = posX + drawSize;
			int s2Y = posY + drawSize;
			g.drawLine(s1X, s1Y, s2X, s2Y);
			int s3X = posX;
			int s3Y = posY + drawSize / 3;
			g.drawLine(s2X, s2Y, s3X, s3Y);
			int s4X = posX + drawSize;
			int s4Y = posY + drawSize / 3;
			g.drawLine(s3X, s3Y, s4X, s4Y);
			int s5X = posX;
			int s5Y = posY + drawSize;
			g.drawLine(s4X, s4Y, s5X, s5Y);
			g.drawLine(s5X, s5Y, s1X, s1Y);
		}
	}

// * Méthode qui retourne le nombre à retrancher (ou ajouter) pour le morphing
	public int getUsedSize() {
		
		int res = 0;
		
		if (increment / 15 == 1) {

			increment = 0;
			res = 1;
		}
		return res;
	}

	public int getDrawSize() {
		return drawSize;
	}

	public boolean isMorph() {
		return morph;
	}

	public void setMorph(boolean bool) {
		this.morph = bool;
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
