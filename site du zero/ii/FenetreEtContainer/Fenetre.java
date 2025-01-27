package ii.FenetreEtContainer;

import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;


@SuppressWarnings("serial")
public class Fenetre extends JFrame {
	
	public Fenetre() {
		
		this.setTitle("Ma premiï¿½re fenï¿½tre");
		this.setSize(240, 150);
		this.setLocationRelativeTo(null);
		
		JPanel pan = new JPanel();
		pan.setBackground(Color.ORANGE);
		this.setContentPane(pan);
		
		this.setVisible(true);
	}

	public static void main(String[] args) {
		
		JFrame fenetre = new Fenetre();
	}
}


@SuppressWarnings("serial")
class Fenetre2 extends JFrame {
	
	public Fenetre2() {
		this.setTitle("Ma premiï¿½re fenï¿½tre java");
		this.setSize(300, 200);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(new Panneau());
		this.setVisible(true);
	}
	
	class Panneau extends JPanel {
		
		public void paintComponent(Graphics g) {
		
			System.out.println("Je suis exï¿½cutï¿½e ! ! !");
			g.fillOval(20, 20, 75, 75);
		}			
	}

	public static void main(String[] args) {
		
		JFrame fenetre = new Fenetre2();
	}
}


@SuppressWarnings("serial")
class Fenetre3 extends JFrame {
	
	public Fenetre3() {
		this.setTitle("3 eme fenï¿½tre java");
		this.setSize(300, 300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(new Panneau());
		this.setVisible(true);
	}
	
	class Panneau extends JPanel {
		
		public void paintComponent(Graphics g) {
		
			int x1 = this.getWidth() / 4;
			int y1 = this.getHeight() / 4;
			System.out.println("largeur = " + this.getWidth() + ", longueur = " + this.getHeight());
			System.out.println(" coordonnï¿½e de dï¿½but d'affichage x1 = " + x1 + " y1 = " + y1);
			g.fillOval(x1, y1, this.getWidth() / 2, this.getHeight() / 2);
		}			
	}

	public static void main(String[] args) {
		
		JFrame fenetre = new Fenetre3();
	}
}


@SuppressWarnings("serial")
class Fenetre4 extends JFrame {
	
	public Fenetre4() {
		this.setTitle("3 eme fenï¿½tre java");
		this.setSize(300, 300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(new Panneau());
		this.setVisible(true);
	}
	
	class Panneau extends JPanel {
		
		public void paintComponent(Graphics g) {
		
//			g.drawString("Tiens ! le Site du Zer0 ! ! !", 10, 40);
//			
//			g.drawRect(10, 10, 50, 60);
//			g.fillRect(65, 65, 30, 40);
			
//			g.drawLine(0, 0, this.getWidth(), this.getHeight());
//			g.drawLine(0, this.getHeight(), this.getWidth(), 0);
			
//			int x[] = { 20, 30, 50, 60, 60, 50, 30, 20 };
//			int y[] = { 30, 20, 20, 30, 50, 60, 60, 50 };
//			g.drawPolygon(x, y, 8);
			
//			int x2[] = { 50, 60, 80, 90, 90, 80, 60, 50 };
//			int y2[] = { 60, 50, 50, 60, 80, 90, 90, 80 };
//			g.fillPolygon(x2, y2, 8);
			
			Font font = new Font("Courier", Font.BOLD, 20);
			g.setFont(font);
			g.setColor(Color.red);
			g.drawString("Tiens ! le Site du Zï¿½r0 ! ! !", 10, 20);
		}			
	}

	public static void main(String[] args) {
		
		JFrame fenetre = new Fenetre4();
	}
}


@SuppressWarnings("serial")
class Fenetre5 extends JFrame {
	
	public Fenetre5() {
		this.setTitle("5 eme fenetre java");
		this.setSize(300, 300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(new Panneau());
		this.setVisible(true);
	}
	
	class Panneau extends JPanel {
		
		public void paintComponent(Graphics g) {
		
			try {
				Image img = ImageIO.read(new File("image.jpg"));
				g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
			} 
			catch (IOException e) {
				e.printStackTrace();
			}
		}			
	}

	public static void main(String[] args) {
		
		JFrame fenetre = new Fenetre5();
	}
}


@SuppressWarnings("serial")
class Fenetre6 extends JFrame {

	public Fenetre6() {
		this.setTitle("5 eme fenetre java");
		this.setSize(300, 300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(new Panneau());
		this.setVisible(true);
	}

	class Panneau extends JPanel {

		public void paintComponent(Graphics g) {

//			Graphics2D gd = (Graphics2D) g;
//			GradientPaint gpp = new GradientPaint(0, 0, Color.RED, 30, 30, Color.cyan, true);
//			gd.setPaint(gpp);
//			gd.fillRect(0, 0, this.getWidth(), this.getHeight());
			

			Graphics2D g2d = (Graphics2D) g;
			GradientPaint gp = new GradientPaint(0 , 0, Color.RED , 20, 0, Color.magenta, true);
			GradientPaint gp2 = new GradientPaint(20, 0, Color.magenta, 40, 0, Color.blue , true);
			GradientPaint gp3 = new GradientPaint(40, 0, Color.blue , 60, 0, Color.green , true);
			GradientPaint gp4 = new GradientPaint(60, 0, Color.green , 80, 0, Color.yellow , true);
			GradientPaint gp5 = new GradientPaint(80, 0, Color.yellow ,100, 0, Color.orange , true);
			GradientPaint gp6 = new GradientPaint(100,0, Color.orange ,120, 0, Color.red , true);
			g2d.setPaint(gp);
			g2d.fillRect(0, 0, 20, this.getHeight()); g2d.setPaint(gp2);
			g2d.fillRect(20, 0, 20, this.getHeight()); g2d.setPaint(gp3);
			g2d.fillRect(40, 0, 20, this.getHeight()); g2d.setPaint(gp4);
			g2d.fillRect(60, 0, 20, this.getHeight()); g2d.setPaint(gp5);
			g2d.fillRect(80, 0, 20, this.getHeight()); g2d.setPaint(gp6);
			g2d.fillRect(100, 0, 40, this.getHeight());
		
		}
	}

	public static void main(String[] args) {

		JFrame fenetre = new Fenetre6();
	}
}


@SuppressWarnings("serial")
class Fenetre7 extends JFrame {

	public Fenetre7() {
		this.setTitle("5 eme fenetre java");
		this.setSize(300, 300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(new Panneau());
		this.setVisible(true);
	}

	class Panneau extends JPanel {

		public void paintComponent(Graphics g) {

			Graphics2D g2d = (Graphics2D) g;
			
			GradientPaint gp = new GradientPaint(20, 20, Color.yellow, 95, 95, Color.blue, true);
			g2d.setPaint(gp);
			g2d.fillOval( this.getWidth() / 4, this.getHeight() / 4, this.getWidth() / 2, this.getHeight() / 2 );
		
		
			GradientPaint gp2 = new GradientPaint(20, 20, Color.green, 55, 75, Color.orange, true);
			g2d.setPaint(gp2);
			g2d.fillRoundRect(30, 30, 75, 75, 10, 10);
		
		}
	}

	public static void main(String[] args) {

		JFrame fenetre = new Fenetre7();
	}
}



@SuppressWarnings("serial")
class Fenetre8 extends JFrame {

	public Fenetre8() {
		this.setTitle("5 eme fenetre java");
		this.setSize(300, 300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(new Panneau());
		this.setVisible(true);
	}

	class Panneau extends JPanel {

		public void paintComponent(Graphics g) {

			g.setColor(Color.BLACK);
			g.fillRect(0, 0, this.getWidth(), this.getHeight());
			Graphics2D g2d = (Graphics2D) g;
			GradientPaint gp = new GradientPaint(0, 0, Color.cyan, 30, 30, Color.pink, true);
			g2d.setPaint(gp);
			Font font = new Font("Comics Sans MS", Font.BOLD, 14);
			g2d.setFont(font);
			g2d.drawString("On s'amuse les ZérOs !", 10, 15);
			gp = new GradientPaint(-40, -40, Color.red, 100, 100, Color.white, false);
			g2d.setPaint(gp);
			font = new Font("Arial Black", Font.PLAIN, 16);
			g2d.setFont(font);
			g2d.drawString("Moi j'aime bien...", 10, 65);

		}
	}

	public static void main(String[] args) {

		JFrame fenetre = new Fenetre8();
	}
}