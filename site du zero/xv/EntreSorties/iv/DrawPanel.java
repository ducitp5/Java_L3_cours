package xv.EntreSorties.iv;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JPanel;

@SuppressWarnings("serial")
class DrawPanel extends JPanel {
	
	Color 	pointerColor 	= Color.red;
	String 	pointerType 	= "CIRCLE";
	int 	pointerSize 	= 15;
	
	ArrayList<Point> points = new ArrayList<Point>();

	public DrawPanel() {
		
		this.addMouseListener(new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent e) {
				points.add(
					new Point(
						e.getX() - pointerSize / 2, 
						e.getY() - pointerSize / 2, 
						pointerSize, 
						pointerColor,
						pointerType
					)
				);
				repaint();
			}
		});
		
		this.addMouseMotionListener(new MouseMotionListener() {
			@Override
			public void mouseDragged(MouseEvent e) {
				points.add(
					new Point(
						e.getX() - (pointerSize / 2), 
						e.getY() - (pointerSize / 2), 
						pointerSize,
						pointerColor, 
						pointerType
					)
				);
				repaint();
			}

			@Override
			public void mouseMoved(MouseEvent e) {
			}
		});
	}

	@Override
	public void paintComponent(Graphics g) {
		// setup background
		g.setColor(Color.white); // background color
		
		g.fillRect(0, 0, this.getWidth(), this.getHeight()); // background size

		for (Point p : this.points) {
			
			g.setColor(p.color);

			if (p.type.equals("SQUARE")) {

				g.fillRect(p.x, p.y, p.size, p.size);
			} 
			else {
				g.fillOval(p.x, p.y, p.size, p.size);
			}
		}
	}

	public void erase() {
		this.points = new ArrayList<Point>();
		repaint();
	}

	public void setPoints(ArrayList<Point> points) {
		this.points = points;
		repaint();
	}
}
