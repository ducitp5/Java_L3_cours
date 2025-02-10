package iii.AnimationSimple;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Fenetre extends JFrame {
	
	private JPanel pan = new JPanel();
	private JButton bouton = new JButton("Mon bouton");

	public Fenetre() {
		this.setTitle("Animation");
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);

		pan.add(bouton);
		this.setContentPane(pan);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		Fenetre fen = new Fenetre();
	}
}

class Fenetre2 extends JFrame {
	
	private JPanel pan = new JPanel();
	private JButton bouton = new JButton("Mon bouton");

	public Fenetre2() {
		
		this.setTitle("Bouton");
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.getContentPane().add(bouton);
		this.setVisible(true);
	}

	public static void main(String[] args) {

		Fenetre2 fen = new Fenetre2();
	}
}

class Fenetre3 extends JFrame {
	
	private JButton bouton = new JButton("BorderLayout.NORTH");

	public Fenetre3() {
		
		this.setTitle("Bouton");
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		this.setLayout(new BorderLayout());
		
		this.getContentPane().add(new JButton("CENTER"), BorderLayout.CENTER);
		this.getContentPane().add(new JButton("NORTH"), BorderLayout.NORTH);
		this.getContentPane().add(new JButton("SOUTH"), BorderLayout.SOUTH);
		this.getContentPane().add(new JButton("WEST"), BorderLayout.WEST);
		this.getContentPane().add(new JButton("EAST"), BorderLayout.EAST);
		
		this.setVisible(true);
	}

	public static void main(String[] args) {
		
		Fenetre3 fen = new Fenetre3();
	}
}


class Fenetre4 extends JFrame {
	
	private JButton bouton = new JButton("BorderLayout.NORTH");

	public Fenetre4() {

		this.setTitle("Bouton");
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		this.setLayout(new GridLayout(3, 2));
		
		this.getContentPane().add(new JButton("1"));
		this.getContentPane().add(new JButton("2"));
		this.getContentPane().add(new JButton("3"));
		this.getContentPane().add(new JButton("4"));
		this.getContentPane().add(new JButton("5"));
		
		this.setVisible(true);
	}

	public static void main(String[] args) {
		Fenetre4 fen = new Fenetre4();
	}
}


class Fenetre5 extends JFrame {
	
	private JButton bouton = new JButton("BorderLayout.NORTH");

	public Fenetre5() {

		this.setTitle("Bouton");
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		GridLayout gl = new GridLayout(3, 2, 15, 25);
//		gl.setHgap(25); // 5 pixels d'espace entre les colonnes
//		gl.setVgap(15); // 5 pixels d'espace entre les lignes
		
		this.setLayout(gl);
		
		this.getContentPane().add(new JButton("1"));
		this.getContentPane().add(new JButton("2"));
		this.getContentPane().add(new JButton("3"));
		this.getContentPane().add(new JButton("4"));
		this.getContentPane().add(new JButton("5"));
		
		this.setVisible(true);
	}

	public static void main(String[] args) {
		Fenetre5 fen = new Fenetre5();
	}
}