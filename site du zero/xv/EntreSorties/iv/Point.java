package xv.EntreSorties.iv;

import java.awt.Color;
import java.io.Serializable;

@SuppressWarnings("serial")
public class Point implements Serializable {
	Color color;
	int size, x, y;
	String type;

	public Point(int x, int y, int size, Color color, String type) {
		this.x = x;
		this.y = y;
		this.size = size;
		this.color = color;
		this.type = type;
	}
}